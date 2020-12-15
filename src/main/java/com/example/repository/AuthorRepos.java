package com.example.repository;

import com.example.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepos extends JpaRepository<Author, Integer> {
}
