package ua.dorosh.shop.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.dorosh.shop.domain.Book;
import ua.dorosh.shop.persistence.BookRepository;

import java.util.List;

/**
 * Created by Alex on 18/03/2015.
 */

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/service/books")
    public @ResponseBody
    List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }
    
    @RequestMapping(value="/service/book/{id}", method= RequestMethod.GET)
    public @ResponseBody
    Book getBookById(@PathVariable Long id) {
        return this.bookRepository.findOne(id);
    }
}
