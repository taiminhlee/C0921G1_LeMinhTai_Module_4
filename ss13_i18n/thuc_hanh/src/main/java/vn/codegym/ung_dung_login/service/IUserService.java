package vn.codegym.ung_dung_login.service;

import org.springframework.stereotype.Service;
import vn.codegym.ung_dung_login.model.User;

import java.util.Optional;

@Service
public interface IUserService {
    Optional<User> findByUserNameAndPassword(String userName, String password);
}
