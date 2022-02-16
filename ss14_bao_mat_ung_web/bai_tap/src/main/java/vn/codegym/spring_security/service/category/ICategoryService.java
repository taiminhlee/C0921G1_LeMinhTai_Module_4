package vn.codegym.spring_security.service.category;

import org.springframework.stereotype.Service;

@Service
public interface ICategoryService<T> {
    Iterable<T> findAll();
}
