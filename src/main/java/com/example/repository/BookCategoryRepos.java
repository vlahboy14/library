package com.example.repository;

import com.example.model.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepos extends JpaRepository<BookCategory, Integer> {
}
