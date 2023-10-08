package com.example.repositories;

import java.util.List;

import com.example.entities.Song;

public interface ISongRepository extends IRepository<Song> {
    void loadSongs(String path) throws Exception;
    Song create(String songName,  String genre, String albumName, String artist, List<String> featuredArtists);
}
