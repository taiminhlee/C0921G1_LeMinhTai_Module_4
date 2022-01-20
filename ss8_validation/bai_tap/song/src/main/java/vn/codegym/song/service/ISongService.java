package vn.codegym.song.service;



import vn.codegym.song.model.Song;

import java.util.List;
import java.util.Optional;

public interface ISongService {
    void save(Song song);
    List<Song> display();
    Optional<Song> findById(Integer id);
}
