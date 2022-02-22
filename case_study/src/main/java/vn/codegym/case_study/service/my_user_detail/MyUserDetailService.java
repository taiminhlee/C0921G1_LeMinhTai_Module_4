package vn.codegym.case_study.service.my_user_detail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.codegym.case_study.model.MyUserDetail;
import vn.codegym.case_study.model.User;
import vn.codegym.case_study.repository.IUserRepository;

@Service
@Transactional
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);

        if (user == null) {
            throw new UsernameNotFoundException("User name: " + username + " not found. ");
        }

        return new MyUserDetail(user);
    }
}
