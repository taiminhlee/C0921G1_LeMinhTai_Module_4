package vn.codegym.case_study.service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.Customer;
import vn.codegym.case_study.repository.ICustomerRepository;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findByCustomerNameContaining(String name, Pageable pageable) {
        return customerRepository.findByCustomerNameContaining(name, pageable);
    }

    @Override
    public Page<Customer> findByCustomerType_CustomerTypeId(Long customerTypeId, Pageable pageable) {
        return customerRepository.findByCustomerType_CustomerTypeId(customerTypeId, pageable);
    }

    @Override
    public Page<Customer> findByCustomerNameContainingAndCustomerType_CustomerTypeId(String name, Long customerTypeId, Pageable pageable) {
        return customerRepository.findByCustomerNameContainingAndCustomerType_CustomerTypeId(name, customerTypeId, pageable);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        customerRepository.delete(id);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }


}
