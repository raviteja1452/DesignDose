package com.example.entities;

import java.util.List;

public class Song {

    private Integer songId;
    private String songName;
    private String genre;
    private String albumName;
    private String artist;
    private List<String> featuredArtists;

    public Song(Integer songId, String songName, String genre, String albumName, String artist, List<String> featuredArtists) {
        this.songId = songId;
        this.songName = songName;
        this.genre = genre;
        this.albumName = albumName;
        this.artist = artist;
        this.featuredArtists = featuredArtists;
    }

    public Integer getSongId() {
        return songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getGenre() {return genre;}

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

    public List<String> getFeaturedArtists() {
        return featuredArtists;
    }

    @Override
    public String toString() {
        return "Song{" + "songId=" + songId + ", songName='" + songName + '\'' + ", genre='" + genre + '\'' + ", albumName='" + albumName + '\'' + ", artist='"
                + artist + '\'' + ", featuredArtists=" + featuredArtists + '}';
    }
}
