package com.example.repositories;

import java.util.List;

import com.example.entities.PlayList;
import com.example.entities.Song;

public interface IPlayListRepository extends IRepository<PlayList> {

    PlayList create(String playListName, String playListOwner, List<Song> songList);
}
