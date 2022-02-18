package vn.codegym.case_study.service.service_type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.ServiceType;
import vn.codegym.case_study.repository.IServiceTypeRepository;

import java.util.List;

@Service
public class ServiceTypeService implements IServiceTypeService{
    @Autowired
    IServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }
}
