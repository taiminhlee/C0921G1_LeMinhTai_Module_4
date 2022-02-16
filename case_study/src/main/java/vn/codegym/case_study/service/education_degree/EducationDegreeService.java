package vn.codegym.case_study.service.education_degree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.EducationDegree;
import vn.codegym.case_study.repository.IEducationDegreeRepository;
import vn.codegym.case_study.service.employee.IEmployeeService;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService{
    @Autowired
    IEducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
