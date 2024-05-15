package com.tscode.java5.controller;


import com.tscode.java5.database.User.QuerryUser;
import com.tscode.java5.mainclass.UserClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
//@SessionAttributes("username")
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Trả về trang đăng nhập (login.html)
    }
    @Autowired
    private QuerryUser querryUser;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model, HttpServletResponse response) {
        // Kiểm tra username và password trong cơ sở dữ liệu
        UserClass user = querryUser.findByAccount(username);
        if (user != null && user.getPassword().equals(password)) {
            // Lưu thông tin đăng nhập vào session hoặc tạo cookie
            model.addAttribute("a", username);
            model.addAttribute("tb", "Đăng nhập thành công!");
            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(24 * 60 * 60); // Thời gian tồn tại của cookie (ví dụ: 1 ngày)
            response.addCookie(cookie);
            return "redirect:/home"; // Đăng nhập thành công, chuyển hướng đến trang home
        } else {
            model.addAttribute("error", "Invalid username or password!");
            return "login"; // Đăng nhập không thành công, hiển thị lại form đăng nhập với thông báo lỗi
        }
    }

    @GetMapping("/logout")
    public String logout(SessionStatus sessionStatus) {
        // Xóa session attribute "username"
        sessionStatus.setComplete();
        return "redirect:/login"; // Đăng xuất thành công, chuyển hướng đến trang đăng nhập
    }
}



