package com.tscode.java5.controller;

import com.tscode.java5.database.User.khaibaohamUser;
import com.tscode.java5.mainclass.UserClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {
    @Autowired
    private khaibaohamUser khaibaohamUser;

    // api them nguoi dung
    @PostMapping("/admin/add")
    public UserClass addClassUser(@RequestBody UserClass UserClass) {
        return khaibaohamUser.addClassUser(UserClass);
    }


    //api cap nhat nguoi dung
    @PutMapping("/admin/update")
    public UserClass updateClassUser(@RequestParam("Id") Integer Id, @RequestBody UserClass UserClass) {
        return khaibaohamUser.upClassUser(Id, UserClass);
    }

    //api xoa nguoi dung
    @DeleteMapping("/admin/detele/{Id}")
    public boolean deleteClassUser(@PathVariable("Id") Integer Id) {

        return khaibaohamUser.deletteClassUser(Id);
    }

    //api lay danh sach nguoi dung
    @GetMapping("/admin/list")
    public List<UserClass> getAlClassUserList() {
        return khaibaohamUser.getClassUsers();
    }
}
