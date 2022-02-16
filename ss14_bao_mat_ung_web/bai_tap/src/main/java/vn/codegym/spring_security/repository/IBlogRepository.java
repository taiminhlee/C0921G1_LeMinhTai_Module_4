package vn.codegym.spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.spring_security.model.Blog;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
}
