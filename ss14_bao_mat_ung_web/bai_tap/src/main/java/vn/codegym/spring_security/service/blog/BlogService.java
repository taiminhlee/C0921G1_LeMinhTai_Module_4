package vn.codegym.spring_security.service.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.spring_security.model.Blog;
import vn.codegym.spring_security.repository.IBlogRepository;


@Service
public class BlogService implements IBlogService {

    @Autowired
    IBlogRepository blogRepository;


    @Override
    public Iterable findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {

    }


}
