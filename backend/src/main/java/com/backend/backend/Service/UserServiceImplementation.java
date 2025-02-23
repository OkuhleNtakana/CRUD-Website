package com.backend.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.Repo.UserRepo;
import com.backend.backend.model.User;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
     private UserRepo userrep;
     
    @Override
    public User saveUser(User user) {
        return userrep.save(user);
    }

    @Override
    public List<User> getAllUsers() {
       return userrep.findAll();
    }

    @Override
    public User getUser(String username) {
        return  userrep.findByUsername(username);
    }

    @Override
    public User UpdateUser(User user) {
        return userrep.saveAndFlush(user);
    }

    @Override
    public void deleteAccount(int id) {
        userrep.deleteById(id);
    }

    @Override
    public boolean login(String username, String password) {
        return userrep.findByUsernameAndUserPassword(username, password).isPresent();
    }
    
}
