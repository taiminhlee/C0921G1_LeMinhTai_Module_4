package vn.codegym.case_study.service.employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.Customer;
import vn.codegym.case_study.model.Employee;

import java.util.List;
import java.util.Optional;

@Service
public interface IEmployeeService {
    Page<Employee> findAll(Pageable pageable);

    Page<Employee> search(String name, String positionId, String divisionId, String educationDegreeId, Pageable pageable);

    void edit(Employee employee);

    void delete(Employee employee);

    Optional<Employee> findById(Long id);

    void save(Employee employee);

    List<Employee> findAll();
}
