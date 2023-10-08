package com.example.repositories.implementations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entities.PlayList;
import com.example.entities.Song;
import com.example.repositories.IPlayListRepository;

public class PlayListRepository implements IPlayListRepository {

    private Map<Integer, PlayList> playListMap;
    private Integer currentPlayListmax;

    public PlayListRepository() {
        playListMap = new HashMap<>();
        currentPlayListmax = 0;
    }
    /**
     * creates an object T in the underlying layer using repository class
     *
     * @param playList
     * @return
     */
    @Override
    public PlayList create(final PlayList playList) {
        return null;
    }

    @Override
    public PlayList create(final String playListName, final String playListOwner, final List<Song> songList) {
        PlayList playList =  new PlayList(++currentPlayListmax, playListName, playListOwner, songList);
        playListMap.put(playList.getPlayListId(), playList);
        return playList;
    }

    /**
     * @param playList
     * @return
     */
    @Override
    public PlayList update(final PlayList playList) {
        return null;
    }

    /**
     * @param playList
     * @return
     */
    @Override
    public boolean delete(final PlayList playList) {
        return false;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public PlayList get(final Integer id) {
        return null;
    }

}
