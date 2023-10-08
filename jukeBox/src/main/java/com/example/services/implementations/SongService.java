package com.example.services.implementations;

import com.example.repositories.ISongRepository;
import com.example.services.ISongService;

public class SongService implements ISongService {

    private ISongRepository songRepository;

    public SongService(ISongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public void loadSongs(final String path) throws Exception{
        songRepository.loadSongs(path);
    }
}
