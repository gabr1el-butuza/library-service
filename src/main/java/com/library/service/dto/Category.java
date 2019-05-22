package com.library.service.dto;

public class Category {
    private String id;

    private String name;

    private int nbOfBooks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbOfBooks() {
        return nbOfBooks;
    }

    public void setNbOfBooks(int nbOfBooks) {
        this.nbOfBooks = nbOfBooks;
    }
}
