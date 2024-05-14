package com.tscode.java5.mainclass;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "account")
    private String account;

    @Column(name ="Name")
    private String name;

    @Column(name = "password")
    private String password;


}
