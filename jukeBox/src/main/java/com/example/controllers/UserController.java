package com.example.controllers;

import com.example.entities.User;
import com.example.services.IUserService;

public class UserController {
    private IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    public void createUser(String userName) {
        if(userName == null || userName.isEmpty()) {
            System.out.println("user name can not be null or empty");
            return;
        }

        // user name regex validations.

        try {
            User user = userService.createUser(userName);
            System.out.println("User Id :" + user.getUserId() +", UserName :" + user.getUserName());
        } catch (Exception ex) {
            System.out.println("There are issues while user creation :" + ex.getMessage());
        }

    }
}
