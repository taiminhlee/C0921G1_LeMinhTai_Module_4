package vn.codegym.blog.service.blog;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.blog.model.Blog;

import java.util.Optional;

@Service
public interface IBlogService<T> {
    Iterable<T> findAll();
    Optional<T> findById(Integer id);

}
