package vn.codegym.case_study.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.codegym.case_study.model.Customer;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,String> {
     @Query(value="select * from customer where customer_status=1", nativeQuery=true)
     Page<Customer> findAll(Pageable pageable);

     Page<Customer> findByCustomerNameContaining(String name, Pageable pageable);

     Page<Customer> findByCustomerType_CustomerTypeId(Long customerTypeId, Pageable pageable);

     Page<Customer> findByCustomerNameContainingAndCustomerType_CustomerTypeId(String name, Long customerTypeId, Pageable pageable);

     Optional<Customer> findByCustomerId(String customerId);

     @Query(value="select customer_id from customer", nativeQuery=true)
     Iterable<String> listIdCustomer();

     @Query(value="select * \n" +
             "from customer\n" +
             " right join contract on customer.customer_id = contract.customer_id \n" +
             "where customer_status=1",nativeQuery=true, countQuery="select count(*) \n" +
             "       from customer \n" +
             "       right join contract on customer.customer_id = contract.customer_id \n" +
             "       where customer_status=1")
     Page<Customer> customerUsing(Pageable pageable);
}
