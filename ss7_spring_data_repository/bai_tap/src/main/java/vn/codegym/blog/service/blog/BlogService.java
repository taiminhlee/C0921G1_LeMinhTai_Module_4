package vn.codegym.blog.service.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.blog.model.Blog;
import vn.codegym.blog.repository.IBlogRepository;

import java.util.Optional;

@Service
public class BlogService implements IBlogService {

    @Autowired
    IBlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
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

    @Override
    public Page<Blog> findByNameContaining(String name, Pageable pageable) {
        return blogRepository.findByNameContaining(name, pageable);
    }

    @Override
    public Page<Blog> findBlogByCategoryId(Integer categoryId, Pageable pageable) {
        return blogRepository.findBlogByCategoryId(categoryId, pageable);
    }

}
