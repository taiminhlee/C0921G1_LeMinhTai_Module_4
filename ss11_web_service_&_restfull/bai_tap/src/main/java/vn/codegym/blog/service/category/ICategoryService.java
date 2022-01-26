package vn.codegym.blog.service.category;

import org.springframework.stereotype.Service;
import vn.codegym.blog.model.Category;

import java.util.List;
import java.util.Optional;

@Service
public interface ICategoryService<T> {
    Iterable<T> findAll();
    Optional<T> findById(Integer id);
}
