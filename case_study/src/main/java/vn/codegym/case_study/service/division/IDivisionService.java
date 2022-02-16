package vn.codegym.case_study.service.division;

import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.Division;

import java.util.List;

@Service
public interface IDivisionService {
    List<Division> findAll();
}
