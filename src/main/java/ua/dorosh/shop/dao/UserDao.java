package ua.dorosh.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.dorosh.shop.entity.user.User;

/**
 * Created by User on 31.05.2017.
 */
public interface UserDao extends JpaRepository<User, Integer> {

    User findById(Long id);
    User findByEmailAndPassword(String email, String password);

    User findByEmail(String email);

}
