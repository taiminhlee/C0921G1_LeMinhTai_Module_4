package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository{
    List<Product> productList=new ArrayList<>();

    {
        productList.add(new Product("Iphone 11","1200","3","Apple"));
        productList.add(new Product("Samsung a52","1000","8","Samsung"));
        productList.add(new Product("Nokia","2200","10","Nokia"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByIndex(int index) {
        return productList.get(index);
    }

    @Override
    public void update( Product product) {
        int index= productList.indexOf(product);
        productList.set(index,product);
    }

    @Override
    public void remove(Product product) {
        productList.remove(product);
    }
}
