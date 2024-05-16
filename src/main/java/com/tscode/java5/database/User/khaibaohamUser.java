package com.tscode.java5.database.User;

import com.tscode.java5.mainclass.SignUpDto;
import com.tscode.java5.mainclass.UserClass;
import com.tscode.java5.mainclass.UserClassDto;

import java.util.List;

public interface khaibaohamUser {


    // them nguoi dung
    public UserClass adduser(SignUpDto SignUpDto);


    //cap nhat nguoi dung
    public UserClass upClassUser(Integer Id, UserClass UserClass);

    //xoa nguoi dung
    public boolean deletteClassUser(Integer Id);

    // lay danh sach user
    public List<UserClass> getClassUsers();

    // lay nhan vien theo id
    public UserClassDto getoneClassUser(Integer Id);

    // login
    public UserClass findByAccount(String account);
}



