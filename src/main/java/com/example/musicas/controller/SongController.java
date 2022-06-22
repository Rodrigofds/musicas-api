package com.example.musicas.controller;

import com.example.musicas.model.Song;
import com.example.musicas.service.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class SongController {

    @Autowired
    private SongRepository songRepository;

    @GetMapping(path = "/song", produces = "application/json")
    public List<Song> getSongList(){
        return songRepository.getList();
    }

    @PostMapping(path = "/song", consumes = "application/json", produces = "application/json")
    public Song addSong(@RequestBody  Song song){
        songRepository.addSong(song);
        return song;
    }

    @PostMapping(path = "/songs", consumes = "application/json", produces = "application/json")
    public List<Song> addListOfSongs(@RequestBody  List<Song> listOfSongs){
        songRepository.addList(listOfSongs);
        return listOfSongs;
    }


}
