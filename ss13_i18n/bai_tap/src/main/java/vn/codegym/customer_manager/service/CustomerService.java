package vn.codegym.customer_manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.customer_manager.model.Customer;
import vn.codegym.customer_manager.repository.ICustomerRepository;

import javax.websocket.server.ServerEndpoint;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    ICustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }
}
