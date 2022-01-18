package vn.codegym.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.blog.model.Blog;
import vn.codegym.blog.repository.IBlogRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService{

    @Autowired
    IBlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return (List<Blog>) blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
      blogRepository.save(blog);
    }

    @Override
    public void remove(Blog blog) {
        blogRepository.delete(blog);
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return blogRepository.findById(id);
    }
}
