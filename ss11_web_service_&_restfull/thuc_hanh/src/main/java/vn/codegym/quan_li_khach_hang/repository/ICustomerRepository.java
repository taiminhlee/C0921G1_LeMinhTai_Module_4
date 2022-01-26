package vn.codegym.quan_li_khach_hang.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.quan_li_khach_hang.model.Customer;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
