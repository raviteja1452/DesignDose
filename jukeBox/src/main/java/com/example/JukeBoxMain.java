package com.example;

import com.example.controllers.SongController;
import com.example.controllers.UserController;
import com.example.repositories.ISongRepository;
import com.example.repositories.IUserRepository;
import com.example.repositories.implementations.SongRepository;
import com.example.repositories.implementations.UserRepository;
import com.example.services.ISongService;
import com.example.services.IUserService;
import com.example.services.implementations.SongService;
import com.example.services.implementations.UserService;

public class JukeBoxMain {
    public static void main(String[] args) {

        String csvFilePath = "/Users/ravitb/Downloads/demo1/src/main/java/com/example/constants/songs.csv";

        IUserRepository userRepository = new UserRepository();
        IUserService userService = new UserService(userRepository);
        UserController userController = new UserController(userService);

        ISongRepository songRepository = new SongRepository();
        ISongService songService = new SongService(songRepository);
        SongController songController = new SongController(songService);

        // if the command says create user.

        userController.createUser(null);
        userController.createUser("ravi");
        userController.createUser("teja");
        userController.createUser("test");
        userController.createUser("");

        userController.createUser("demba");
        userController.createUser("damian");

        songController.loadSongs(csvFilePath);
        songController.loadSongs("example1/constants/songs.csv");
    }
}
