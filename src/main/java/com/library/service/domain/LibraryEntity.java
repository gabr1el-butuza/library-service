package com.library.service.domain;

import com.library.service.dto.Book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
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

    @NotNull
    private String categoryId;

//    @ManyToOne
//    @JoinColumn(name = "categoryId")
//    private CategoryEntity categoryId;

//    public LibraryEntity(String name, String description, Date lastModifiedOn, CategoryEntity notebookId) {
//        this.name = name;
//        this.description = description;
//        this.lastModifiedOn = lastModifiedOn;
//        this.notebookId = notebookId;
//    }


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
