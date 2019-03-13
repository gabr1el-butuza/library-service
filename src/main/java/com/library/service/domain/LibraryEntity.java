package com.library.service.domain;

import com.library.service.dto.Book;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class LibraryEntity extends BaseEntity{
    @Column(nullable = false)
    private String name;

    @Lob
    private String description;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String code;

    @Column(name = "price")
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public static Book toBook(LibraryEntity libraryEntity){
        Book book = new Book();

        book.setId(libraryEntity.getId());
        book.setName(libraryEntity.getName());
        book.setDescription(libraryEntity.getDescription());
        book.setAuthor(libraryEntity.getAuthor());
        book.setPrice(libraryEntity.getPrice());

        return book;
    }
}
