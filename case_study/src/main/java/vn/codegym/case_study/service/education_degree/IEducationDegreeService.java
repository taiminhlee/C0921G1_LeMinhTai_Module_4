package vn.codegym.case_study.service.education_degree;

import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.EducationDegree;

import java.util.List;

@Service
public interface IEducationDegreeService {
    List<EducationDegree> findAll();
}
