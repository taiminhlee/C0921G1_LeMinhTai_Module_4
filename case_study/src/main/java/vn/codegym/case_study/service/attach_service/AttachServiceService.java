package vn.codegym.case_study.service.attach_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.AttachService;
import vn.codegym.case_study.repository.IAttachServiceRepository;

import java.util.List;

@Service
public class AttachServiceService implements IAttachServiceService{
    @Autowired
    IAttachServiceRepository attachServiceRepository;

    @Override
    public List<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }
}
