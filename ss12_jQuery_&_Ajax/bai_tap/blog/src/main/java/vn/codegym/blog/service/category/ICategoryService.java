package vn.codegym.blog.service.category;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ICategoryService<T> {
    Iterable<T> findAll();
    Optional<T> findById(Integer id);
}
