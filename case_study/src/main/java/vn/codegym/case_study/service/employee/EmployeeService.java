package vn.codegym.case_study.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.Employee;
import vn.codegym.case_study.repository.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    IEmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Page<Employee> findByEmployeeNameContaining(String name, Pageable pageable) {
        return employeeRepository.findByEmployeeNameContaining(name, pageable);
    }

    @Override
    public Page<Employee> findByDivision_DivisionId(Long divisionId, Pageable pageable) {
        return employeeRepository.findByDivision_DivisionId(divisionId, pageable);
    }

    @Override
    public Page<Employee> findByPosition_PositionId(Integer positionId, Pageable pageable) {
        return employeeRepository.findByPosition_PositionId(positionId, pageable);
    }

    @Override
    public Page<Employee> findByEducationDegree_EducationDegreeId(Long educationDegreeId, Pageable pageable) {
        return employeeRepository.findByEducationDegree_EducationDegreeId(educationDegreeId, pageable);
    }

    @Override
    public Page<Employee> findByEmployeeNameContainingAndDivision_DivisionIdAndPosition_PositionIdAndEducationDegree_EducationDegreeId(String employeeName, Long divisionId, Integer positionId, Long educationDegreeId, Pageable pageable) {
        return employeeRepository.findByEmployeeNameContainingAndDivision_DivisionIdAndPosition_PositionIdAndEducationDegree_EducationDegreeId(employeeName, divisionId, positionId, educationDegreeId, pageable);
    }

    @Override
    public Page<Employee> findByEmployeeNameContainingAndPosition_PositionId(String employeeName, Integer PositionId, Pageable pageable) {
        return employeeRepository.findByEmployeeNameContainingAndPosition_PositionId(employeeName, PositionId, pageable);
    }
}
