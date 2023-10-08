package com.example.controllers;

import com.example.services.ISongService;

public class SongController {
    private ISongService songService;

    public SongController(ISongService songService) {
        this.songService = songService;
    }

    public void loadSongs(String path) {
        if(path == null || path.isEmpty()) {
            System.out.println("path can not be null or empty");
            return;
        }
        // file existing at a requested path.
        try {
            songService.loadSongs(path);
        } catch (Exception ex) {
            System.out.println("Could not load songs from path " + path  + " , because of " + ex.getMessage());
        }
    }
}
