package com.library.service.service;

import com.library.service.domain.LibraryEntity;
import com.library.service.dto.Book;
import com.library.service.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.library.service.domain.LibraryEntity.toBook;

@Service
public class LibraryService {
    @Autowired
    protected LibraryRepository libraryRepository;

    public Book createBook(Book book){
        LibraryEntity libraryEntity = new LibraryEntity();
        libraryEntity.setName(book.getName());
        libraryEntity.setDescription(book.getDescription());
        libraryEntity.setAuthor(book.getAuthor());
        libraryEntity.setCode(book.getCode());
        libraryEntity.setPrice(book.getPrice());

        LibraryEntity savedBook =libraryRepository.saveAndFlush(libraryEntity);
        return toBook(savedBook);
    }

    public List<Book> getAllBooks(){
        List<LibraryEntity> bookss =libraryRepository.findAll();
        List<Book> items = new ArrayList<>();

        for (LibraryEntity i : bookss){
            items.add(toBook(i));
        }
        return items;
    }
}
