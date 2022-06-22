package com.example.musicas.service;

import com.example.musicas.model.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
    private List<Song> songs = new ArrayList<>();

    public List<Song> getList(){
        return songs;
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void addList(List<Song> listOfSongs){
        songs.addAll(listOfSongs);
    }
}
