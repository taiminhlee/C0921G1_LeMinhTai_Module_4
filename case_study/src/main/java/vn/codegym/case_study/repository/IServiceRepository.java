package vn.codegym.case_study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study.model.Service;

import java.util.Iterator;
import java.util.Optional;

@Repository
public interface IServiceRepository extends JpaRepository<Service,String> {
    @Query(value="select service_id from service", nativeQuery=true)
    Iterable<String> listServiceId();
}
