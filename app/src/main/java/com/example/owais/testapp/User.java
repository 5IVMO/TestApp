package com.example.owais.testapp;

import java.io.Serializable;

/**
 * Created by Owais on 3/13/2017.
 */
public class User implements Serializable {
    private  String userName;
    private String PassWord;

    public User() {
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        PassWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }
}
