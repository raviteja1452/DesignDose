package com.example.services.implementations;

import com.example.entities.PlayList;
import com.example.entities.Song;
import com.example.services.ICurrentPlayService;

public class CurrentPlayService implements ICurrentPlayService {

    @Override
    public PlayList chooseCurrentPlayList(final Integer userId, final Integer playListId) {
        return null;
    }

    @Override
    public Song playNext(final Integer userId) {

        return null;
    }

    @Override
    public Song playPrevious(final Integer userId) {
        return null;
    }

    @Override
    public Song chooseASong(final Integer userId, final Integer songId) {
        return null;
    }
}
