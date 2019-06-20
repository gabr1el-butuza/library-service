package com.library.service.api;

import com.library.service.dto.Book;
import com.library.service.dto.Category;
import com.library.service.dto.Feedback;
import com.library.service.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface LibraryApi {

    @RequestMapping(value = "/book",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Book> createBook(@RequestBody Book body);

    @RequestMapping(value = "/user",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<User> createUser(@RequestBody User body);

    @RequestMapping(value = "/books",
            produces = { "application/json" },
            //consumes = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<Book>> getAllBooks();

    @RequestMapping(value = "/users",
            produces = { "application/json" },
            //consumes = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<User>> getAllUsers();

    @RequestMapping(value = "/book-delete/{id}",
            produces = {"application/json"},
            //consumes = {"application/json"},
            method = RequestMethod.DELETE)
    ResponseEntity<Boolean> removeBook(@PathVariable("id") String id);

    @RequestMapping(value = "/category-delete/{id}",
            produces = {"application/json"},
            //consumes = {"application/json"},
            method = RequestMethod.DELETE)
    ResponseEntity<Boolean> removeCategory(@PathVariable("id") String id);

    @RequestMapping(value = "/feedback",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Feedback> sendFeedback(@RequestBody Feedback body);

    @RequestMapping(value = "/categories",
            produces = {"application/json"},
            //consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<Category>> getAllCategories();

    @RequestMapping(value = "/category",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Category> createCategory(@RequestBody Category body);

    @RequestMapping(value = "/category/{id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<Category> updateCategory(@PathVariable("id") String id, @RequestBody Category body);

    @RequestMapping(value = "/book/{id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<Book> updateBook(@PathVariable("id") String id, @RequestBody Book body);

    @RequestMapping(value = "/byCategory/{id}",
            produces = {"application/json"},
            //consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<Book>> getBooksByCategory(@PathVariable("id") String id);
}
