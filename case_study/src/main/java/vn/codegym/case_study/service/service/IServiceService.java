package vn.codegym.case_study.service.service;



import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IServiceService {
    void create(vn.codegym.case_study.model.Service service);
    Iterable<String> listServiceId();
    List<vn.codegym.case_study.model.Service> findAll();
}
