package com.example.controller;

import com.example.model.Author;
import com.example.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public String getAuthors(Model model) {
        List<Author> authors = authorService.findAll();
        model.addAttribute("authors", authors);
        return "authors-list";
    }

    @GetMapping("/author-create")
    public String createAuthorForm(Author author){
        return "author-create";
    }

    @PostMapping("/author-create")
    public String createAuthor(Author author){
        authorService.saveAuthor(author);
        return "redirect:/authors";
    }
}
