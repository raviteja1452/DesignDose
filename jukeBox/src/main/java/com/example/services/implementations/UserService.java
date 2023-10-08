package com.example.services.implementations;

import com.example.entities.User;
import com.example.repositories.IUserRepository;
import com.example.services.IUserService;

public class UserService implements IUserService {

    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(final String userName) {
        User user = this.userRepository.create(userName);
        return user;
    }
}
