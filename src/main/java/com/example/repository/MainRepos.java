package com.example.repository;

import com.example.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainRepos extends JpaRepository<Author, Integer> {
}
