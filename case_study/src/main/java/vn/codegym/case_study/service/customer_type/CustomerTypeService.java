package vn.codegym.case_study.service.customer_type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.CustomerType;
import vn.codegym.case_study.repository.ICustomerTypeRepository;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService{
    @Autowired
    ICustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
