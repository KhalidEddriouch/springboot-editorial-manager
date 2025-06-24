package com.ditorial.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditorial.demo.Model.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {
    // Additional query methods can be defined here if needed
    Optional<Author> findByUsername(String username);

    void delete(Author author);

}
