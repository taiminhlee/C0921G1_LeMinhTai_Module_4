package vn.codegym.them_san_pham_vao_gio_hang.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.them_san_pham_vao_gio_hang.model.Product;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {

}
