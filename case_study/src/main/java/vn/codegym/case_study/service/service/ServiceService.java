package vn.codegym.case_study.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.repository.IServiceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceService implements IServiceService {
    @Autowired
    IServiceRepository serviceRepository;

    @Override
    public void create(vn.codegym.case_study.model.Service service) {
        service.setServiceStatus("1");
        serviceRepository.save(service);
    }

    @Override
    public Iterable<String> listServiceId() {
        return serviceRepository.listServiceId();
    }

    @Override
    public List<vn.codegym.case_study.model.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Optional<vn.codegym.case_study.model.Service> findById(String id) {
        return serviceRepository.findById(id);
    }

    @Override
    public void delete(vn.codegym.case_study.model.Service service) {
        service.setServiceStatus("0");
        serviceRepository.save(service);
    }
}
