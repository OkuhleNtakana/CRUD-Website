package com.backend.backend.model;

import jakarta.persistence.*;

@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
public class  User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    private String identification;
    private String name;
    private String userSurname;
    private String email;
    private String userPassword;
    private boolean userActive;
    @Enumerated(value=EnumType.STRING)
    private UserType usertype;

    public UserType getUsertype() {
        return this.usertype;
    }

    public void setUsertype(UserType usertype) {
        this.usertype = usertype;
    }

    private String address;
    private String gender;
    private String experience;
    private int age;

    //Getters
    public int getUserAge(){
        return this.age;
    }
    public String getUserId(){
        return this.identification;
    }
    public String getName(){
        return this.name;
    }
    public String getUserSurname(){
        return this.userSurname;
    }
    public String getUsername(){
        return this.email;
    }
    public String getUserAddress(){
        return this.address;
    }
    public String getUserGender(){
        return this.gender;
    }
    public boolean getUserActive(){
        return this.userActive;
    }
    public String getUserExperience(){
        return this.experience;
    }
    public String getUserPassword(){
        return this.userPassword;
    }

    //Setters
    public void setUserId(String ID){
        this.identification = ID;
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
    public void setUserEmail(String email){
        this.email=email;
    }

    public void setUserAddress(String Address){
        this.address = Address;
    }
    public void setUserGender(String Gender){
        this.gender =Gender;
    }
    public void setUserExperience(String Experience){
        this.experience =Experience;
    }
    public void setUserAge(int Age){
        this.age =Age;
    }
    

   
}
