package com.example.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "category")
    private String category;

    @Column(name = "description")
    private String description;

    @Column(name = "timestamp")
    private String timestamp;


    public Book() {
    }

    public Book(String name, String author, String category, String description, String timestamp) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.description = description;
        this.timestamp = timestamp;
    }
}
