package com.example.services.implementations;

import java.util.List;
import java.util.stream.Collectors;

import com.example.entities.PlayList;
import com.example.entities.Song;
import com.example.entities.User;
import com.example.repositories.IPlayListRepository;
import com.example.repositories.ISongRepository;
import com.example.repositories.IUserRepository;
import com.example.services.IPlayListService;
import com.example.services.ISongService;

public class PlayListService implements IPlayListService {
    private IUserRepository userRepository;
    private ISongRepository songRepository;
    private IPlayListRepository playListRepository;

    public PlayListService(IUserRepository userRepository, ISongRepository songRepository, IPlayListRepository playListRepository) {
        this.userRepository = userRepository;
        this.songRepository = songRepository;
        this.playListRepository = playListRepository;
    }
    /**
     * @param userId
     * @param playListName
     * @param songIds
     * @return
     */
    @Override
    public PlayList createPlayList(final Integer userId, final String playListName, final List<Integer> songIds) {
        User user = userRepository.get(userId);
        if(user == null) {
            throw new RuntimeException("user not found for id: " + userId);
        }
        List<Song> songs = songIds.stream().map(songId -> {
            Song song = songRepository.get(songId);
            if(song == null) {
                throw new RuntimeException("song not found for id " + songId);
            }
            return song;
        }).collect(Collectors.toList());

        PlayList playList = playListRepository.create(playListName, user.getUserName(), songs);
        return playList;
    }

    /**
     * @param userId
     * @param playListId
     * @return
     */
    @Override
    public Boolean deletePlayList(final Integer userId, final String playListId) {
        return null;
    }

    /**
     * @param userId
     * @param playListId
     * @param songids
     * @return
     */
    @Override
    public PlayList addSongsToPlayList(final Integer userId, final Integer playListId, final List<Integer> songids) {
        return null;
    }

    /**
     * @param userId
     * @param playListId
     * @param songids
     * @return
     */
    @Override
    public PlayList removeSongsToPlayList(final Integer userId, final Integer playListId, final List<Integer> songids) {
        return null;
    }
}
