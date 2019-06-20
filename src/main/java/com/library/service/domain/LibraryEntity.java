package com.library.service.domain;

import com.library.service.dto.Book;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "book")
public class LibraryEntity extends BaseEntity {
    @Column(nullable = false)
    private String title;

    @Lob
    private String text;

    private Date lastModifiedOn;

//    @Column(name="book_path")
//    private String bookPath;

    @NotNull
    private String categoryId;

    @PrePersist
    protected void onCreate() {
        lastModifiedOn = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        lastModifiedOn = new Date();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getLastModifiedOn() {
        return lastModifiedOn;
    }

    public void setLastModifiedOn(Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    //Converted from entity to book
    public static Book toBook(LibraryEntity libraryEntity) {
        Book book = new Book();

        book.setId(libraryEntity.getId());
        book.setTitle(libraryEntity.getTitle());
        book.setText(libraryEntity.getText());
        book.setLastModifiedOn(libraryEntity.getLastModifiedOn());
        book.setCategoryId(libraryEntity.getCategoryId());

        return book;
    }
}
