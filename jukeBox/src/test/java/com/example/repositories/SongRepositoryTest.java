package com.example.repositories;

import org.junit.jupiter.api.Test;

import com.example.repositories.implementations.SongRepository;

public class SongRepositoryTest {

    SongRepository songRepository;

   @Test
    public void testLoadSongs_success() {
        songRepository = new SongRepository();
        songRepository.loadSongs("test");
    }

    @Test
    public void testLoadSongs_failure_1() {
        songRepository = new SongRepository();
        songRepository.loadSongs("test");
    }

    @Test
    public void testLoadSongs_failure_2() {
        songRepository = new SongRepository();
        songRepository.loadSongs("test");
    }
}
