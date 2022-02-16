package vn.codegym.case_study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study.model.EducationDegree;

@Repository
public interface IEducationDegreeRepository extends JpaRepository<EducationDegree,Long> {
}
