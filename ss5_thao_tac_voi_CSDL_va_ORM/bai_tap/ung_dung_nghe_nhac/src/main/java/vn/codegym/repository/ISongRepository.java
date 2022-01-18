package vn.codegym.repository;

import vn.codegym.model.Song;

import java.util.List;

public interface ISongRepository {
    void create(Song song);
    List<Song> display();
    void edit(Song song);
    void delete(Song song);
    Song findOne(Integer id);
}
