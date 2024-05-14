package com.tscode.java5.database.User;

import com.tscode.java5.mainclass.UserClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserClass, Integer> {
    UserClass findByAccount(String account);
}
