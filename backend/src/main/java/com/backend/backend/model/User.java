package com.backend.backend.model;
import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userId;
    private String name;
    private String userSurname;
    private String username;
    private String userPassword;
    private boolean userActive;

    public String getUserId(){
        return this.userId;
    }
    public String getName(){
        return this.name;
    }
    public String getUserSurname(){
        return this.userSurname;
    }
    public String getUsername(){
        return this.username;
    }
    public String getUserPassword(){
        return this.userPassword;
    }
    public boolean getUserActive(){
        return this.userActive;
    }

    public void setUserId(String ID){
        this.userId = ID;
    }
    public void setName(String name){
        this.name =name;
    }
    public void setUserSurname(String surname){
        this.userSurname =surname;
    }
    public void setUserActive(boolean active){
        this.userActive =active;
    }    
    public void setUserPassword(String password){
        this.userPassword =password;
    }
    public void setUsername(String Username){
        this.username=Username;
    }
}
