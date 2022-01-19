package vn.codegym.blog.service.catetgory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.blog.model.Category;
import vn.codegym.blog.repository.ICategoryRepository;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    ICategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
