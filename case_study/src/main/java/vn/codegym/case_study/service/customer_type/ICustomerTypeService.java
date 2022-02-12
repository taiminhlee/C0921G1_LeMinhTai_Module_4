package vn.codegym.case_study.service.customer_type;

import vn.codegym.case_study.model.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
