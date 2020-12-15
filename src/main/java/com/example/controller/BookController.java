package com.example.controller;

import com.example.model.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public String getBooks(Model model) {
        List<Book> book = bookService.findAll();
        model.addAttribute("book", book);
        return "book-list";
    }

    @GetMapping("/book-create")
    public String createBookForm(Book book) {
        return "book-create";
    }

    @PostMapping("/book-create")
    public String createBook(Book book) {
        bookService.saveBook(book);
        return "redirect:/book";
    }

    @GetMapping("/book-delete/{id}")
    public String deleteBook(@PathVariable("id") Integer id) {
        bookService.deleteBookById(id);
        return "redirect:/book";
    }
}
