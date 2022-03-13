package com.pemawa.User.Registration.and.Login.Controller;

import com.pemawa.User.Registration.and.Login.Entity.User;
import com.pemawa.User.Registration.and.Login.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    public UserRepository userRepository;

    @PostMapping("/user")
    public User RegisterUser(User user){
        return userRepository.save(user);
    }

}
