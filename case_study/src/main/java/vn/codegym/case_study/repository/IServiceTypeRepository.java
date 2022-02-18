package vn.codegym.case_study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study.model.ServiceType;

@Repository
public interface IServiceTypeRepository extends JpaRepository<ServiceType,Integer> {
}
