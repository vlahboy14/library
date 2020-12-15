package com.example.service;

import com.example.model.Author;
import com.example.repository.AuthorRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepos authorRepos;

    @Autowired
    public AuthorService(AuthorRepos authorRepos) {
        this.authorRepos = authorRepos;
    }

    public Author findById(Integer id) {
        return authorRepos.getOne(id);
    }

    public List<Author> findAll() {
        return authorRepos.findAll();
    }

    public Author saveAuthor(Author author) {
        return authorRepos.save(author);
    }

    public void deleteAuthorById(Integer id) {
        authorRepos.deleteById(id);
    }
}
