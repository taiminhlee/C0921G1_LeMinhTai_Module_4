package vn.codegym.quan_ly_dien_thoai.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.quan_ly_dien_thoai.model.Smartphone;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
}
