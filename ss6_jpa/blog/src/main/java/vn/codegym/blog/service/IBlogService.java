package vn.codegym.blog.service;

import vn.codegym.blog.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();
    void save(Blog blog);
    void remove(Blog blog);
    Optional<Blog> findById(Integer id);
}
