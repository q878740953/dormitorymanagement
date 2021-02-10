package com.example.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Users {
    private int id;
    private String username;
    private String password;
    private Date createTime;
    private Date lastLoginTime;
    private String ip;
}