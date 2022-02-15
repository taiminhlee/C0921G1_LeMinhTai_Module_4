package vn.codegym.customer_manager.service;

import vn.codegym.customer_manager.model.Customer;

public interface ICustomerService {
    Iterable<Customer> findAll();
}
