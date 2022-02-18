package vn.codegym.case_study.service.service_type;

import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.ServiceType;

import java.util.List;

@Service
public interface IServiceTypeService {
    List<ServiceType> findAll();
}
