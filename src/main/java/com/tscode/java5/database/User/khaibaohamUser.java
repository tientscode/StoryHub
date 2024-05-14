package com.tscode.java5.database.User;

import com.tscode.java5.mainclass.UserClass;

import java.util.List;

public interface khaibaohamUser {

    // them moi nguoi dung
    public UserClass addClassUser(UserClass UserClass);

    //cap nhat nguoi dung
    public UserClass upClassUser(Integer Id, UserClass UserClass);

    //xoa nguoi dung
    public boolean deletteClassUser(Integer Id);

    // lay danh sach user
    public List<UserClass> getClassUsers();

    // lay nhan vien theo id
    public UserClass getoneClassUser(Integer Id);

    // login
    public UserClass findByAccount(String account);
}



