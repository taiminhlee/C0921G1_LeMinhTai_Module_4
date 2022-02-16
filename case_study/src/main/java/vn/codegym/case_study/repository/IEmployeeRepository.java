package vn.codegym.case_study.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study.model.Customer;
import vn.codegym.case_study.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(value="select * from employee where employee_status=1", nativeQuery=true)
    Page<Employee> findAll(Pageable pageable);

    Page<Employee> findByEmployeeNameContaining(String name, Pageable pageable);

    Page<Employee> findByEmployeeNameContainingAndPosition_PositionId(String employeeName, Integer PositionId, Pageable pageable);

    Page<Employee> findByDivision_DivisionId(Long divisionId, Pageable pageable);

    Page<Employee> findByPosition_PositionId(Integer positionId, Pageable pageable);

    Page<Employee> findByEducationDegree_EducationDegreeId(Long educationDegreeId, Pageable pageable);

    Page<Employee> findByEmployeeNameContainingAndDivision_DivisionIdAndPosition_PositionIdAndEducationDegree_EducationDegreeId(

            String employeeName, Long divisionId, Integer positionId, Long educationDegreeId, Pageable pageable);
}
