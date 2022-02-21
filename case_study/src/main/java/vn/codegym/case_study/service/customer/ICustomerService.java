package vn.codegym.case_study.service.customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import vn.codegym.case_study.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findByCustomerNameContaining(String name, Pageable pageable);

    Page<Customer> findByCustomerType_CustomerTypeId(Long customerTypeId, Pageable pageable);

    Page<Customer> findByCustomerNameContainingAndCustomerType_CustomerTypeId(String name, Long customerTypeId, Pageable pageable);

    void save(Customer customer);

    void delete(Customer customer);

    Optional<Customer> findById(String id);

    Iterable<String> listIdCustomer();

    List<Customer> findAll();

    Page<Customer> customerUsing(Pageable pageable);
}
