package com.example.repositories;

import java.util.List;

import com.example.entities.User;

public interface IUserRepository extends IRepository<User> {
    /**
     *
     * @param userNamePrefix
     * @return
     */
    List<User> filterUserByNamePrefix(String userNamePrefix);

    User create(String userName);
}
