package vn.codegym.song.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.song.model.Song;
import vn.codegym.song.repository.ISongRepository;


import java.util.List;
import java.util.Optional;

@Service
public class SongService implements ISongService{
    @Autowired
    ISongRepository songRepository;

    @Override
    public void save(Song song) {
        songRepository.save(song);
    }

    @Override
    public List<Song> display() {
        return songRepository.findAll();
    }

    @Override
    public Optional<Song> findById(Integer id) {
        return songRepository.findById(id);
    }


}
