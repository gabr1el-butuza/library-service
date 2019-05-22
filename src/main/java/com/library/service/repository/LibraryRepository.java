package com.library.service.repository;

import com.library.service.domain.LibraryEntity;
import com.library.service.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryEntity, String>{
    List<Book> findByTitleIgnoreCaseContaining(String title);
    String GET_BOOKS_ASSOCIATED_WITH_CATEGORY_SQL = "SELECT *\n" +
            "FROM book\n" +
            "Right JOIN category ON book.categoryId = category.id\n" +
            "where book.categoryId = ?1";

            @Query(value= GET_BOOKS_ASSOCIATED_WITH_CATEGORY_SQL, nativeQuery=true)
    List<LibraryEntity> findAllByCategory(String categoryId);
}
