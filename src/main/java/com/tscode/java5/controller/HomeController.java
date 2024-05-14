package com.tscode.java5.controller;

import com.tscode.java5.database.khaibaoham;
import com.tscode.java5.mainclass.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hehe")
public class HomeController {
    @Autowired
    private khaibaoham khaibaoham;

//    //test
//    @GetMapping("/vip")
//    public String test() {
//        return "kkkk";
//    }


    // api them nguoi dung
    @PostMapping("/add")
    public user addClassUser(@RequestBody user user) {
        return khaibaoham.addClassUser(user);
    }


    //api cap nhat nguoi dung
    @PutMapping("/update")
    public user updateClassUser(@RequestParam ("Id") Integer Id, @RequestBody user user ){
        return khaibaoham.upClassUser(Id, user);
    }

    //api xoa nguoi dung
    @DeleteMapping("/detele")
    public boolean deleteClassUser(@PathVariable ("Id") Integer Id){
        return khaibaoham.deletteClassUser(Id);
    }

    //api lay danh sach nguoi dung
    @GetMapping("/list")
    public List<user> getAlClassUserList(){
        return khaibaoham.getClassUsers();
    }
}
