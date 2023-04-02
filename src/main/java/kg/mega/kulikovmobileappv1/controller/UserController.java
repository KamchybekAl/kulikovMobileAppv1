package kg.mega.kulikovmobileappv1.controller;

import kg.mega.kulikovmobileappv1.model.User;
import kg.mega.kulikovmobileappv1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;
    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }



}

