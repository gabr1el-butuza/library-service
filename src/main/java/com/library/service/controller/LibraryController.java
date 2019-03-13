package com.library.service.controller;

import com.library.service.api.LibraryApi;
import com.library.service.dto.Book;
import com.library.service.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController implements LibraryApi {

    @Autowired
    private LibraryService libraryService;

    @Override
    public ResponseEntity<Book> createBook(@RequestBody Book body) {
        Book pizza = libraryService.createBook(body);
        return new ResponseEntity<>(pizza, HttpStatus.CREATED);

    }

    @Override
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> allpiz = libraryService.getAllBooks();
        return new ResponseEntity<>(allpiz, HttpStatus.OK);
    }
}
