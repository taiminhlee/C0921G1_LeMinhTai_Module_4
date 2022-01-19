package vn.codegym.blog.service.catetgory;

import org.springframework.stereotype.Service;
import vn.codegym.blog.model.Category;

import java.util.List;

@Service
public interface ICategoryService {
    List<Category> findAll();
}
