package vn.codegym.blog.repository;

import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.blog.model.Blog;

import java.util.Optional;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findByNameContaining(String name, Pageable pageable);
    Page<Blog> findBlogByCategoryId(Integer categoryId, Pageable pageable);

}
