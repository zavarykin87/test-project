package ru.zavarykin.spring.restapp.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.zavarykin.spring.restapp.entity.User;
import ru.zavarykin.spring.restapp.service.UserService;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> userList(){
        return userService.userList();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User newUser){
        return userService.addUser(newUser);
    }

}
