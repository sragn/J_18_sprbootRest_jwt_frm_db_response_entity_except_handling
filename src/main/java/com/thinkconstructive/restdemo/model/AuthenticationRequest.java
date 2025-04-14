package com.thinkconstructive.restdemo.model;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable {


    private String username;
    private String password;
    private String hkey;
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHkey() {
        return hkey;
    }

    public void setHkey(String hkey) {
        this.hkey = hkey;
    }
    
    //need default constructor for JSON Parsing
    public AuthenticationRequest()
    {

    }

    public AuthenticationRequest(String username, String password, String hkey) {
        this.setUsername(username);
        this.setPassword(password);
        this.setHkey(hkey);
    }
}
