package com.backend.backend.Controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.backend.backend.Service.UserService;
import com.backend.backend.model.User;


@RestController
@RequestMapping("/user")
@CrossOrigin 
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<Map<String, String>> add(@RequestBody User user){
        userService.saveUser(user);
            Map<String, String> response = new HashMap<>();
    response.put("message", "New User is added");
    
    return ResponseEntity.ok(response);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
         return userService.getAllUsers();
    }
    @GetMapping("/get")
    public String get(){
         return "YHOOOOOOOOOOOO";
    }
    @GetMapping("/getUser/{username}")
    public User getUser(@PathVariable String username){
        return userService.getUser(username);
    }
    
    @GetMapping("/login/{username}/{password}")
    public boolean login(@PathVariable String username, @PathVariable String password){
         return userService.login(username, password);
    }

    // @PutMapping("/updateUser")
    //     public String updateUser(@RequestBody User user){
    //         userService.UpdateUser(user);
    //         return "User updated";
    //     }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        userService.deleteAccount(id);
        return "User deleted";
    }


}

