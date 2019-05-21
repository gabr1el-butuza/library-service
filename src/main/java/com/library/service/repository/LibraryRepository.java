package com.library.service.repository;

import com.library.service.domain.LibraryEntity;
import com.library.service.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryEntity, String>{
    List<Book> findByTitleIgnoreCaseContaining(String title);
//    String GET_BOOKS_ASSOCIATED_WITH_CATEGORY_SQL = "SELECT b.title, b.description, b.lastModifiedOn FROM book b Right JOIN category bc ON b.categoryId = bc.categoryId where b.categoryId = ?1";
//            @Query(value= GET_BOOKS_ASSOCIATED_WITH_CATEGORY_SQL, nativeQuery=true)
//    List<LibraryEntity> findAllByCategory(String categoryId);
}
