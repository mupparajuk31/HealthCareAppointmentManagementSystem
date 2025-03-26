package com.example.healthcare.Model;
import org.springframework.stereotype.Component;
@component
public class UserModel {
	private String userID;
    private String name;
    private String role;
    private String email;
    private String phone;
    private String password;
    //getter
    public String getUserID() {
        return userID;
    }
    //setter
    public void setUserID(String userID) {
        this.userID = userID;
    }
 
    public String getName() {
        return userID;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    public String getRole() {
        return role;
    }
 
    public void setRole(String role) {
        this.role = role;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}
