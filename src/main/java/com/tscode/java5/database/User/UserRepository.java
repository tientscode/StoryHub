package com.tscode.java5.database.User;

import com.tscode.java5.mainclass.UserClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserClass, Integer> {
    UserClass findByAccount(String account);


    boolean existsByaccount(String account);


}
