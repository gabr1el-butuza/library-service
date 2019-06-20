package com.library.service.controller;

import com.library.service.api.LibraryApi;
import com.library.service.dto.Book;
import com.library.service.dto.Category;
import com.library.service.dto.Feedback;
import com.library.service.dto.User;
import com.library.service.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController implements LibraryApi {

    @Autowired
    private LibraryService libraryService;

    @Override
    public ResponseEntity<Book> createBook(@RequestBody Book body) {
        Book book = libraryService.createBook(body);
        return new ResponseEntity<>(book, HttpStatus.CREATED);

    }

    @Override
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> allbooks = libraryService.getAllBooks();
        return new ResponseEntity<>(allbooks, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Boolean> removeBook(@PathVariable("id") String id){
        libraryService.removeBook(id);
        return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Boolean> removeCategory(@PathVariable("id") String id){
        libraryService.removeCategory(id);
        return new ResponseEntity(Boolean.TRUE, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Feedback> sendFeedback(@RequestBody Feedback body) {
        Feedback feedmodel = libraryService.sendFeedback(body);
        return new ResponseEntity<>(feedmodel, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> allcateg= libraryService.getAllCategories();
        return new ResponseEntity<>(allcateg, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> allusers= libraryService.getAllUsers();
        return new ResponseEntity<>(allusers, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Category> createCategory(@RequestBody Category body){
        Category notebookmodel = libraryService.createCategory(body);
        return new ResponseEntity<>(notebookmodel, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Category> updateCategory(@PathVariable("id") String id, @RequestBody Category body) {
        Category updatedCateg = libraryService.updateCategory(id, body);
        return new ResponseEntity<>(updatedCateg, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> updateBook(@PathVariable("id") String id, @RequestBody Book body) {
        Book updatedBook = libraryService.updateBook(id, body);
        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }

    public ResponseEntity<List<Book>> getBooksByCategory(@PathVariable("id") String id){
        List<Book> bookss = libraryService.getBooksByCategory(id);
        return new ResponseEntity<>(bookss, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> createUser(@RequestBody User body) {
        User user = libraryService.createUser(body);
        return new ResponseEntity<>(user, HttpStatus.CREATED);

    }

}
