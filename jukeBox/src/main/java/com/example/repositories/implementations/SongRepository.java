package com.example.repositories.implementations;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entities.Song;
import com.example.repositories.ISongRepository;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class SongRepository implements ISongRepository {

    private Map<Integer, Song> songMap;
    private Integer currentKeyMax;

    public SongRepository() {
        songMap = new HashMap<>();
    }


    /**
     * creates an object T in the underlying layer using repository class
     *
     * @param song
     * @return
     */
    @Override
    public Song create(final Song song) {
        if(!songMap.containsKey(song.getSongId())) {
            songMap.put(song.getSongId(), song);
        }
        return songMap.get(song.getSongId());
    }

    /**
     *
     * @param songName
     * @param genre
     * @param albumName
     * @param artist
     * @param featuredArtists
     * @return
     */
    @Override
    public Song create(final String songName, final String genre, final String albumName, final String artist,
            final List<String> featuredArtists) {
        Song song = new Song(++currentKeyMax, songName, genre, albumName, artist, featuredArtists);
        songMap.put(currentKeyMax, song);
        return song;
    }

    /**
     * @param song
     * @return
     */
    @Override
    public Song update(final Song song) {
        Song songToUpdate =  songMap.get(song.getSongId());
        songToUpdate.setSongName(song.getSongName());
        return songToUpdate;
    }

    /**
     * @param song
     * @return
     */
    @Override
    public boolean delete(final Song song) {
        if(songMap.containsKey(song.getSongId())) {
            songMap.remove(song.getSongId());
            return true;
        }
        return false;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Song get(final Integer id) {
        return songMap.get(id);
    }

    /**
     * load the songs from csv file & convert the songs into Java Song Pojos.
     * @param path
     */
    @Override
    public void loadSongs(final String path) throws Exception {
        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            List<String[]> rows = reader.readAll();

            for (String[] row : rows) {
                String[] featuredArtistsArray = row[5].split("#");
                List<String> featuredArtists = new ArrayList<>();
                for (String artist : featuredArtistsArray) {
                    featuredArtists.add(artist.trim());
                }
                Song song = new Song(Integer.parseInt(row[0]), row[1], row[2], row[3], row[4], featuredArtists);
                songMap.put(Integer.parseInt(row[0]), song);

            }

            // Now, 'songs' list contains the loaded data.
            System.out.println(songMap.values());
            currentKeyMax = songMap.size();
        } catch (IOException | CsvException e) {
            // e.printStackTrace();
            throw new Exception(e);
        }
    }
}
