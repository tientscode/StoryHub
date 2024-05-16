package com.tscode.java5.database.User;


import com.tscode.java5.database.role.RoleRepository;
import com.tscode.java5.mainclass.RoleClass;
import com.tscode.java5.mainclass.SignUpDto;
import com.tscode.java5.mainclass.UserClass;
import com.tscode.java5.mainclass.UserClassDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class QuerryUser implements khaibaohamUser {

    @Autowired
    private UserRepository storyHubsotry;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserClass adduser(SignUpDto signUpDto) {
        if (storyHubsotry.existsByaccount(signUpDto.getAccount())) {
            throw new RuntimeException("accoutn already exists");
        }
        UserClass userclass = new UserClass();
        userclass.setAccount(signUpDto.getAccount());
        userclass.setPassword(signUpDto.getPassword());
        userclass.setName(signUpDto.getName());
        userclass.setActive(true);

        RoleClass defaultRole = roleRepository.findByName("Role_User");
        userclass.setRoles(Collections.singleton(defaultRole));
        return storyHubsotry.save(userclass);
    }



    @Override
    public UserClass upClassUser(Integer Id, UserClass UserClass) {
        if (UserClass != null) {
            UserClass userClass1 = storyHubsotry.getById(Id);
            if (userClass1 != null) {
                userClass1.setAccount(UserClass.getAccount());
                userClass1.setPassword(UserClass.getPassword());
                userClass1.setName(UserClass.getName());
                userClass1.setActive(UserClass.getActive());
                UserClass.setRoles(UserClass.getRoles());
                return storyHubsotry.save(userClass1);
            }
        }
        return null;
    }

    @Override
    public boolean deletteClassUser(Integer Id) {
        if (Id >= 0) {
            UserClass UserClass = storyHubsotry.getById(Id);
            if (UserClass != null) {
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
    public UserClassDto getoneClassUser(Integer Id) {
        if (Id != null) {
            UserClass userClass1 = storyHubsotry.getById(Id);
            if (userClass1 != null) {
                return new UserClassDto(userClass1.getName(), userClass1.getAccount(), userClass1.getPassword());
            }
        }
        return null;
    }

    @Override
    public UserClass findByAccount(String account) {
        return storyHubsotry.findByAccount(account);
    }

}
