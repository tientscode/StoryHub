package com.tscode.java5.database;


import com.tscode.java5.mainclass.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuerryUser implements khaibaoham {

    @Autowired
    private StoryHub StoryHubsotry;

    @Override
    public user addClassUser(user user) {
        if(user!=null){
            return StoryHubsotry.save(user);
        }
        return null;
    }

    @Override
    public user upClassUser(Integer Id, user user) {
        if(user!=null){
            com.tscode.java5.mainclass.user user1=StoryHubsotry.getById(Id);
            if(user1!=null){
                user1.setAccount(user.getAccount());
                user1.setPassword(user.getPassword());
                user1.setName(user.getName());
                return StoryHubsotry.save(user1);
            }
        }
        return null;
    }

    @Override
    public boolean deletteClassUser(Integer Id) {
        if(Id>=0){
            user user=StoryHubsotry.getById(Id);
            if(user!=null){
                StoryHubsotry.delete(user);
                return true;
            }

        }
        return false;
    }


    @Override
    public List<user> getClassUsers() {
        return StoryHubsotry.findAll();
    }

    @Override
    public user getoneClassUser(Integer Id) {
        return StoryHubsotry.getById(Id);
    }


}
