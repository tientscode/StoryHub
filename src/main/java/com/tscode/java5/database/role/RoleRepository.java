package com.tscode.java5.database.role;

import com.tscode.java5.mainclass.RoleClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleClass, Long> {
    RoleClass findByName(String name);
}
