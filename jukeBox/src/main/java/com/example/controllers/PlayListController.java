package com.example.controllers;

import java.util.List;

import org.apache..LifecycleState;

import com.example.services.IPlayListService;

public class PlayListController {
    private IPlayListService playListService;

    public PlayListController(IPlayListService playListService) {
        this.playListService = playListService;
    }

    public void createPlayList(Integer userId, String playListName, List<Integer> songIds) {
        if(userId == null || userId <= 0) {
            System.out.println("userId provided is not valid");
            return;
        }

        if(playListName == null || playListName.isEmpty())  {
            System.out.println("play list name can not be null or empty");
            return;
        }
    }

}
