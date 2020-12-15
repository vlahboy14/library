package com.example.service;

import com.example.model.Book;
import com.example.repository.BookRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepos bookRepos;

    @Autowired
    public BookService(BookRepos bookRepos) {
        this.bookRepos = bookRepos;
    }

    public Book findById(Integer id) {
        return bookRepos.getOne(id);
    }

    public List<Book> findAll() {
        return bookRepos.findAll();
    }

    public Book saveBook(Book book) {
        return bookRepos.save(book);
    }

    public void deleteBookById(Integer id) {
        bookRepos.deleteById(id);
    }
}
