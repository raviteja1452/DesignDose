package com.example.demo;

import com.example.entities.Song;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class testMain {

    public static void main(String[] args) {
        String csvFilePath = "/Users/ravitb/Downloads/demo1/src/main/java/com/example/constants/songs.csv";

        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
            List<String[]> rows = reader.readAll();
            List<Song> songs = new ArrayList<>();

            for (String[] row : rows) {
                String[] featuredArtistsArray = row[5].split("#");
                List<String> featuredArtists = new ArrayList<>();
                for (String artist : featuredArtistsArray) {
                    featuredArtists.add(artist.trim());
                }
                Song song = new Song(Integer.parseInt(row[0]), row[1], row[2], row[3], row[4], featuredArtists);
                songs.add(song);
            }

            // Now, 'songs' list contains the loaded data.
            System.out.println(songs);
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
