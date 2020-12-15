package com.example.repository;

import com.example.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepos extends JpaRepository<Book, Integer> {
}
