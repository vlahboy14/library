package com.example.service;

import com.example.model.Author;
import com.example.repository.MainRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final MainRepos mainRepos;

    @Autowired
    public AuthorService(MainRepos mainRepos) {
        this.mainRepos = mainRepos;
    }

    public Author findById(Integer id) {
        return mainRepos.getOne(id);
    }

    public List<Author> findAll() {
        return mainRepos.findAll();
    }

    public Author saveAuthor(Author author) {
        return mainRepos.save(author);
    }

    public void deleteAuthorById(Integer id) {
        mainRepos.deleteById(id);
    }
}
