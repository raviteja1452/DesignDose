package com.example.entities;

import java.util.List;
import java.util.stream.Collectors;

public class PlayList {
    private Integer playListId;
    private String playListName;
    private String playListOwner;
    private List<Song> songs;

    public PlayList(Integer playListId, String playListName, String playListOwner, List<Song> songs) {
        this.playListId = playListId;
        this.playListName = playListName;
        this.playListOwner = playListOwner;
        this.songs = songs;
    }

    public Integer getPlayListId() {
        return playListId;
    }

    public String getPlayListName() {
        return playListName;
    }

    public String getPlayListOwner() {
        return playListOwner;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public List<Integer> getSongIds() {
        return songs.stream()
                .map(song -> song.getSongId())
                .collect(Collectors.toList());
    }

    /**
     * verify if the requested songs are present in the playlist,
     *  if so remove from the playlist, if not throw an error.
     * @param newSongs
     */
    public void addSongs(List<Song> newSongs) {
        // TODO
    }

    /**
     * verify if the requested songs are present in the playlist,
     *  if so remove from the playlist, if not throw an error.
     * @param removeSongs
     */
    public void removeSongs(List<Song> removeSongs) {
        // TODO
    }
}
