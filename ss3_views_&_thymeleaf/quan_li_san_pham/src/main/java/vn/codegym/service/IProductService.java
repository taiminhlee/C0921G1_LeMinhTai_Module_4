package vn.codegym.service;

import vn.codegym.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void save(Product product);

    Product findByIndex(int index);

    void update( Product product);

    void remove(Product product);
}
