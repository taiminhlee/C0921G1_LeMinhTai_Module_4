package vn.codegym.blog.service.blog;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.blog.model.Blog;

import java.util.List;
import java.util.Optional;

@Service
public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    void save(Blog blog);
    void remove(Blog blog);
    Optional<Blog> findById(Integer id);
    Page<Blog> findByNameContaining(String name, Pageable pageable);
    Page<Blog> findBlogByCategoryId(Integer categoryId, Pageable pageable);
    Page<Blog> findByNameContainingAndCategoryId(String name, Integer category_id, Pageable pageable);
}
