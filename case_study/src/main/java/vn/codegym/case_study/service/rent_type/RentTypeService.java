package vn.codegym.case_study.service.rent_type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.RentType;
import vn.codegym.case_study.repository.IRentTypeRepository;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService{
    @Autowired
    IRentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
