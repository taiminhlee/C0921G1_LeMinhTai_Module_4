package vn.codegym.case_study.service.division;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.Division;
import vn.codegym.case_study.repository.IDivisionRepository;

import java.util.List;

@Service
public class DivisionService implements IDivisionService{
    @Autowired
    IDivisionRepository divisionRepository;
    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
