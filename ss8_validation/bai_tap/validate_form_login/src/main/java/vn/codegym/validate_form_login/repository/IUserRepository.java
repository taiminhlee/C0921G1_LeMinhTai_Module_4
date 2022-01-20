package vn.codegym.validate_form_login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.validate_form_login.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {

}
