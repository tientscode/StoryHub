package com.tscode.java5.database.User;


import com.tscode.java5.mainclass.UserClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuerryUser implements khaibaohamUser {

    @Autowired
    private UserRepository storyHubsotry;

    @Override
    public UserClass addClassUser(UserClass UserClass) {
        if(UserClass !=null){
            return storyHubsotry.save(UserClass);
        }
        return null;
    }

    @Override
    public UserClass upClassUser(Integer Id, UserClass UserClass) {
        if(UserClass !=null){
            UserClass userClass1 = storyHubsotry.getById(Id);
            if(userClass1 !=null){
                userClass1.setAccount(UserClass.getAccount());
                userClass1.setPassword(UserClass.getPassword());
                userClass1.setName(UserClass.getName());
                return storyHubsotry.save(userClass1);
            }
        }
        return null;
    }

    @Override
    public boolean deletteClassUser(Integer Id) {
        if(Id>=0){
            UserClass UserClass = storyHubsotry.getById(Id);
            if(UserClass !=null){
                storyHubsotry.delete(UserClass);
                return true;
            }

        }
        return false;
    }


    @Override
    public List<UserClass> getClassUsers() {
        return storyHubsotry.findAll();
    }

    @Override
    public UserClass getoneClassUser(Integer Id) {
        return storyHubsotry.getById(Id);
    }

    @Override
    public UserClass findByAccount(String account) {
        return storyHubsotry.findByAccount(account);
    }

}
