package com.example.repositories.implementations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entities.User;
import com.example.repositories.IUserRepository;

public class UserRepository implements IUserRepository {
     private Map<Integer, User> users;
     private Integer currentUserCount;

     public UserRepository() {
         users = new HashMap<>();
         currentUserCount = 0;
     }
    /**
     * creates an object T in the underlying layer using repository class
     *
     * @param user
     * @return
     */
    @Override
    public User create(final User user) {
        return null;
    }

    @Override
    public User create(final String userName) {
        currentUserCount++;
        User user = new User(currentUserCount, userName);
        users.put(currentUserCount, user);
        return user;
    }

    /**
     * @param user
     * @return
     */
    @Override
    public User update(final User user) {
        return null;
    }

    /**
     * @param user
     * @return
     */
    @Override
    public boolean delete(final User user) {
        return false;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public User get(final Integer id) {
        return users.get(id);
    }

    /**
     * @param userNamePrefix
     * @return
     */
    @Override
    public List<User> filterUserByNamePrefix(final String userNamePrefix) {
        return null;
    }
}
