package vn.codegym.case_study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study.model.AttachService;

@Repository
public interface IAttachServiceRepository extends JpaRepository<AttachService,Integer> {
}
