package com.tscode.java5.database;

import com.tscode.java5.mainclass.user;

import java.util.List;

public interface khaibaoham {

    // them moi nguoi dung
    public user addClassUser(user user);

    public user upClassUser(Integer Id, user user);

    //xoa nguoi dung
    public boolean deletteClassUser(Integer Id);

    // lay danh sach user
    public List<user> getClassUsers();

    // lay nhan vien theo id
    public user getoneClassUser(Integer Id);
}



