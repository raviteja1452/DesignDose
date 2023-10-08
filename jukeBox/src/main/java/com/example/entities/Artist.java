package com.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Artist extends User {
    private List<Album> albumList;
    public Artist(final Integer userId, final String userName) {
        super(userId, userName);
        albumList = new ArrayList<>();
    }

    public void createAlbum(Album newAlbum) {
        this.albumList.add(newAlbum);
    }

    public List<Album> getAlbumList() {
        return albumList;
    }
}
