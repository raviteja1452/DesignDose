package com.example.entities;

import java.util.List;

public class Album {
    private Integer albumId;
    private String albumName;
    private List<Song> songList;

    public Album(Integer albumId, String albumName, List<Song> songList) {
        this.albumId = albumId;
        this.albumName = albumName;
        this.songList = songList;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public List<Song> getSongList() {
        return songList;
    }
}
