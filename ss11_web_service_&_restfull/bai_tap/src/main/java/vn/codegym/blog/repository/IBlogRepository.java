package vn.codegym.blog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.blog.model.Blog;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    Iterable<Blog> findByCategoryId(Integer categoryId);
}
