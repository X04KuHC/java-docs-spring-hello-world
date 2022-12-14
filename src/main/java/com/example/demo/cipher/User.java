package com.example.demo.cipher;

public class User {
    private static int id = 0;
    private int userID;
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.userID = id;
        id++;
    }
    public String getName() { return name; }
    public int getID() {return userID;}
    public boolean checkPassword(String input) {
        return password.equals(input);
    }

    public void updatePassword(String oldPass, String newPass) {
        if(password.equals(oldPass)) {
           password = newPass;
        }
    }
}
