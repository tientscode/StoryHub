package com.tscode.java5.database;

import com.tscode.java5.mainclass.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryHub extends JpaRepository<user, Integer> {
}
