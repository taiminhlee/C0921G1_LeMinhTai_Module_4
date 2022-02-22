package vn.codegym.case_study.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.User;
import vn.codegym.case_study.repository.IUserRepository;

@Service
public class UserService implements IUserService{
    @Autowired
    IUserRepository userRepository;
    @Override
    public void save(User user) {
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode("123"));
        userRepository.save(user);
    }
}
