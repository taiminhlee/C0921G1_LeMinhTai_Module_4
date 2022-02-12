package vn.codegym.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.blog.model.Blog;

import java.util.Optional;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    Iterable<Blog> findByNameContaining(String name);
}
