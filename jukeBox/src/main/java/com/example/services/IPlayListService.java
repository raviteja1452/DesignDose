package com.example.services;

import java.util.List;

import com.example.entities.PlayList;

public interface IPlayListService {
    /**
     *
     * @param userId
     * @param playListName
     * @param songIds
     * @return
     */
    PlayList createPlayList(Integer userId, String playListName, List<Integer> songIds);

    /**
     *
     * @param userId
     * @param playListId
     * @return
     */
    Boolean deletePlayList(Integer userId, String playListId);

    /**
     *
     * @param userId
     * @param playListId
     * @param songids
     * @return
     */
    PlayList addSongsToPlayList(Integer userId, Integer playListId, List<Integer> songids);

    /**
     *
     * @param userId
     * @param playListId
     * @param songids
     * @return
     */
    PlayList removeSongsToPlayList(Integer userId, Integer playListId, List<Integer> songids);

}
