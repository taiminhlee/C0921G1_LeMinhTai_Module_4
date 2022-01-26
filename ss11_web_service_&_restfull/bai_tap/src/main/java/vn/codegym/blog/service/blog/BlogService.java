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
    public Iterable findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Optional findById(Integer id) {
        return blogRepository.findById(id);
    }
}
