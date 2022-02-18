package vn.codegym.case_study.service.rent_type;

import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.RentType;

import java.util.List;

@Service
public interface IRentTypeService {
    List<RentType> findAll();
}
