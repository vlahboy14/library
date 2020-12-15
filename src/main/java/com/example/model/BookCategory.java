package com.example.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "book_category")
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "book_category")
    private String bookCategory;

    public BookCategory() {
    }

    public BookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }
}
