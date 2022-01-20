package vn.codegym.validate_form_login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.validate_form_login.model.User;
import vn.codegym.validate_form_login.repository.IUserRepository;

@Service
public class UserService implements IUserService{
    @Autowired
    IUserRepository userRepository;


    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
