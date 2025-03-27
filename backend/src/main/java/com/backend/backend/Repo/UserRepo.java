 package com.backend.backend.Repo;
 
import com.backend.backend.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
    User findByUsername(String username); 
    Optional<User> findByUsernameAndUserPassword(String username, String userPassword); 
    User updateUser(User user);

}
