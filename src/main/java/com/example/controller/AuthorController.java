package com.example.controller;

import com.example.model.Author;
import com.example.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/author")
    public String getAuthors(Model model) {
        List<Author> author = authorService.findAll();
        model.addAttribute("author", author);
        return "author-list";
    }

    @GetMapping("/author-create")
    public String createAuthorForm(Author author){
        return "author-create";
    }

    @PostMapping("/author-create")
    public String createAuthor(Author author) {
        authorService.saveAuthor(author);
        return "redirect:/author";
    }

    @GetMapping("/author-delete/{id}")
    public String deleteAuthor(@PathVariable("id") Integer id) {
        authorService.deleteAuthorById(id);
        return "redirect:/author";
    }
}
