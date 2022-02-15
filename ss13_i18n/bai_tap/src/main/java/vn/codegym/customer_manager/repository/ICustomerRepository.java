package vn.codegym.customer_manager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.customer_manager.model.Customer;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Long> {
}
