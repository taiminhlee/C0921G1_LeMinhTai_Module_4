package vn.codegym.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.blog.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
