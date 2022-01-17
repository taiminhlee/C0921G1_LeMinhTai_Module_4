package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Product;
import vn.codegym.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findByIndex(int index) {
        return productRepository.findByIndex(index);
    }

    @Override
    public void update( Product product) {
       productRepository.update(product);
    }

    @Override
    public void remove(Product product) {
        productRepository.remove(product);
    }
}
