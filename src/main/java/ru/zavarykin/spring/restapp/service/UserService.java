package ru.zavarykin.spring.restapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zavarykin.spring.restapp.entity.User;
import ru.zavarykin.spring.restapp.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User newUser){
        User userFromDb = userRepository.findByName(newUser.getName());
        if(userFromDb == null) {
            userRepository.save(newUser);
            return newUser;
        }
        return null;
    }

    public List<User> userList(){
        List<User> userList = new ArrayList<>();
        userList = userRepository.findAll();
        return userList;
    }
}
