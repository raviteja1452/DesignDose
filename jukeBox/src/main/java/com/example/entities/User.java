package com.example.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Integer userId;
    private String userName;
    private List<PlayList> playLists;

    public User(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        playLists = new ArrayList<>();
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public List<PlayList> getPlayListList() {
        return playLists;
    }

    public void createAndAddPlayList(PlayList playList) {
        playLists.add(playList);
    }

    /**
     * valiate if the playlist is available , if so delete.
     * if not return or throw an error.
     * @param playList
     */
    public void deletePlayList(PlayList playList) {
        // TODO.
        playLists.remove(playList);
    }
}
