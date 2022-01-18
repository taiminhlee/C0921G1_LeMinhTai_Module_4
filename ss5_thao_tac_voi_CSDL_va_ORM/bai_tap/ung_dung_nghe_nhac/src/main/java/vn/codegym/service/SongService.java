package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Song;
import vn.codegym.repository.ISongRepository;

import java.util.List;

@Service
public class SongService implements ISongService{
    @Autowired
    ISongRepository songRepository;

    @Override
    public void create(Song song) {
        songRepository.create(song);
    }

    @Override
    public List<Song> display() {
        return songRepository.display();
    }

    @Override
    public void edit(Song song) {

    }

    @Override
    public boolean delete(Song song) {
       return songRepository.delete(song);
    }

    @Override
    public Song findOne(int id) {
        return songRepository.findOne(id);
    }
}
