package com.ditorial.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditorial.demo.Model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Additional query methods can be defined here if needed
}
