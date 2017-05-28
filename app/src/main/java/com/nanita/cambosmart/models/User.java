package com.nanita.cambosmart.models;

/**
 * Created by chhaichivon on 4/27/17.
 */

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private String role;

    public User(int id, String username, String email , String password, String role){
        super();
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
