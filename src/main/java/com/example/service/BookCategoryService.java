package com.example.service;

import com.example.model.BookCategory;
import com.example.repository.BookCategoryRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCategoryService {

    private final BookCategoryRepos bookCategoryRepos;

    @Autowired
    public BookCategoryService(BookCategoryRepos bookCategoryRepos) {
        this.bookCategoryRepos = bookCategoryRepos;
    }

    public List<BookCategory> findAll() {
        return bookCategoryRepos.findAll();
    }

    public BookCategory saveBookCategory(BookCategory bookCategory) {
        return bookCategoryRepos.save(bookCategory);
    }

    public void deleteBookCategoryById(Integer id) {
        bookCategoryRepos.deleteById(id);
    }
}
