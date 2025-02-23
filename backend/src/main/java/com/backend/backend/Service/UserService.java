package com.backend.backend.Service;

import java.util.List;

import com.backend.backend.model.User;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
    public User getUser(String Username);
    public User UpdateUser(User user);
    public void deleteAccount(int id);
    public boolean login(String Username,String Password); 
}
