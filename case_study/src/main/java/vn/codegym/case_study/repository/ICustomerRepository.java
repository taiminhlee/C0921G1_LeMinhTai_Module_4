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
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
     @Query(value="select * from customer where customer_status=1", nativeQuery=true)
     Page<Customer> findAll(Pageable pageable);

     Page<Customer> findByCustomerNameContaining(String name, Pageable pageable);

     Page<Customer> findByCustomerType_CustomerTypeId(Long customerTypeId, Pageable pageable);

     Page<Customer> findByCustomerNameContainingAndCustomerType_CustomerTypeId(String name, Long customerTypeId, Pageable pageable);

//     @Query(value=" update customer " +
//             "  set customer_status=0 " +
//             " where customer_id = :id ", nativeQuery=true)
//     @Modifying
//     @Transactional
//     void delete(@Param("id") String id);

     Optional<Customer> findByCustomerId(String customerId);

     @Query(value="select customer_id from customer", nativeQuery=true)
     Iterable<String> listIdCustomer();
}
