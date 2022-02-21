package vn.codegym.case_study.service.attach_service;

import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.AttachService;

import java.util.List;

@Service
public interface IAttachServiceService {
    List<AttachService> findAll();
}
