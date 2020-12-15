package com.example.controller;

import com.example.model.BookCategory;
import com.example.service.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookCategoryController {

    private final BookCategoryService bookCategoryService;

    @Autowired
    public BookCategoryController(BookCategoryService bookCategoryService) {
        this.bookCategoryService = bookCategoryService;
    }

    @GetMapping("/book-category")
    public String getBookCategory(Model model) {
        List<BookCategory> bookCategory = bookCategoryService.findAll();
        model.addAttribute("bookCategory", bookCategory);
        return "book-category-list";
    }

    @GetMapping("/book-category-create")
    public String createBookCategoryForm(BookCategory bookCategory) {
        return "book-category-create";
    }

    @PostMapping("/book-category-create")
    public String createBookCategory(BookCategory bookCategory) {
        bookCategoryService.saveBookCategory(bookCategory);
        return "redirect:/book-category";
    }

    @GetMapping("/book-category-delete/{id}")
    public String deleteBookCategory(@PathVariable("id") Integer id) {
        bookCategoryService.deleteBookCategoryById(id);
        return "redirect:/book-category";
    }
}
