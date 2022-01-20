package vn.codegym.song.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.song.model.Song;


import java.util.Optional;

@Repository
public interface ISongRepository extends JpaRepository<Song,Integer> {
    Optional<Song> findById(Integer id);
}
