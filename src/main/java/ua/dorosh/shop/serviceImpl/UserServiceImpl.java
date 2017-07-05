package ua.dorosh.shop.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.dorosh.shop.dao.UserDao;
import ua.dorosh.shop.entity.user.Role;
import ua.dorosh.shop.entity.user.User;
import ua.dorosh.shop.service.UserService;

/**
 * Created by n.dorosh on 01.07.2017.
 */

@Service("userDetailsService")
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserDao userDao;

//    @Autowired
//    private BCryptPasswordEncoder encoder;

//    @Bean
//    public BCryptPasswordEncoder encoder (BCryptPasswordEncoder encoder) {
//      return encoder;
//    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println("user from database");
        System.out.println(userDao.findByEmail(s));
        return userDao.findByEmail(s);
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User findByEmailAndPassword(String Email, String Password) {
        return null;
    }

    @Override
    public void save(User user) {
        System.out.println("AAAAaaaaa1: " + user);
        user.setRole(Role.USER);
        user.setEnable(true);
        System.out.println("AAAAaaaaa2: " + user);
       // user.setPassword(encoder.encode(user.getPassword()));

        userDao.save(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
