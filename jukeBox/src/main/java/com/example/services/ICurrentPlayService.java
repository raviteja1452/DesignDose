package com.example.services;

import com.example.entities.PlayList;
import com.example.entities.Song;

public interface ICurrentPlayService {

    PlayList chooseCurrentPlayList(Integer userId, Integer playListId);

    Song playNext(Integer userId);

    Song playPrevious(Integer userId);

    Song chooseASong(Integer userId, Integer songId);
}
