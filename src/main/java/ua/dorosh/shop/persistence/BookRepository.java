package ua.dorosh.shop.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.dorosh.shop.domain.Book;

/**
 * Created by Alex on 07/03/2015.
 */

public interface BookRepository extends JpaRepository<Book, Long> {
}
