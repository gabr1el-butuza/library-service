package com.library.service.repository;

import com.library.service.domain.LibraryEntity;
import com.library.service.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryEntity, String>{
    List<Book> findByNameIgnoreCaseContaining(String name);

}
