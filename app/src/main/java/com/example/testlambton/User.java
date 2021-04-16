package com.example.testlambton;

public class User {
    private String userName;
    private String password;
    private String name;

    public User(String userName, String password, String name) {
        this.userName = userName;
        this.password = password;
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName(){
        return name;
    }
}
