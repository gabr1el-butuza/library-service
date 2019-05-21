package com.library.service.domain;

import com.library.service.dto.Category;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {
    @NotNull
    private String name;

    private int nbOfBooks;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryId", cascade = CascadeType.ALL)
//    private List<LibraryEntity> books;


    //Getter and setter


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

    public static Category toCategory(CategoryEntity categoryEntity) {
        Category category = new Category();

        category.setCategoryId(categoryEntity.getId());
        category.setName(categoryEntity.getName());
        category.setNbOfBooks(categoryEntity.getNbOfBooks());

        return category;
    }
}
