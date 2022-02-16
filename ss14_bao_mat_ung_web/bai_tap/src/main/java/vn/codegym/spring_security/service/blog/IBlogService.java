package vn.codegym.spring_security.service.blog;

import org.springframework.stereotype.Service;
import vn.codegym.spring_security.model.Blog;

@Service
public interface IBlogService {
    Iterable<Blog> findAll();
    void save(Blog blog);
}
