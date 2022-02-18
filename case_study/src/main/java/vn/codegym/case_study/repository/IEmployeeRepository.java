package vn.codegym.case_study.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(value="select * from employee where employee_status=1", nativeQuery=true)
    Page<Employee> findAll(Pageable pageable);

    @Query(value="select * from employee e\n" +
            "inner join position p on e.position_id=p.position_id\n" +
            "inner join division d on e.division_id=d.division_id\n" +
            "inner join education_degree edu on e.education_degree_id=edu.education_degree_id\n" +
            "where e.employee_name like %:name% and e.position_id like %:position_id% and e.division_id like %:division_id%" +
            " and" +
            " e.education_degree_id like %:education_degree_id%",
            nativeQuery=true)
    Page<Employee> search(@Param("name") String name,@Param("position_id") String positionId,
                          @Param("division_id") String divisionId, @Param("education_degree_id")
                          String educationDegreeId, Pageable pageable);
}
