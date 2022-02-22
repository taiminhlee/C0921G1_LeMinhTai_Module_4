package vn.codegym.case_study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.case_study.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String userName);
}
