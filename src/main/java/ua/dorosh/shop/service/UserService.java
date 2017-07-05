package ua.dorosh.shop.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ua.dorosh.shop.entity.user.User;

/**
 * Created by User on 31.05.2017.
 */
public interface UserService extends UserDetailsService {
    User findById(Long id);
    User findByEmailAndPassword(String Email, String Password);

    void save(User user);
    void update(User user);
    void delete(User user);
}
