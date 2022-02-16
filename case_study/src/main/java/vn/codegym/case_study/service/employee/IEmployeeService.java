package vn.codegym.case_study.service.employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.Customer;
import vn.codegym.case_study.model.Employee;

@Service
public interface IEmployeeService {
    Page<Employee> findAll(Pageable pageable);

    Page<Employee> findByEmployeeNameContaining(String name, Pageable pageable);

    Page<Employee> findByDivision_DivisionId(Long DivisionId, Pageable pageable);

    Page<Employee> findByPosition_PositionId(Integer PositionId, Pageable pageable);

    Page<Employee> findByEducationDegree_EducationDegreeId(Long EducationDegreeId, Pageable pageable);

    Page<Employee> findByEmployeeNameContainingAndDivision_DivisionIdAndPosition_PositionIdAndEducationDegree_EducationDegreeId(

            String employeeName, Long divisionId, Integer positionId, Long educationDegreeId, Pageable pageable);
    Page<Employee> findByEmployeeNameContainingAndPosition_PositionId(String employeeName, Integer PositionId, Pageable pageable);
}
