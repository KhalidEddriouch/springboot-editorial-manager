package com.ditorial.demo.Service;


import java.util.Optional;

import com.ditorial.demo.Model.Author;
import com.ditorial.demo.Repository.AuthorRepository;

public class AuthorService {
     // Injecting the AuthorRepository to handle database operations
     private final AuthorRepository authorRepository;

     // Constructor injection for AuthorRepository
     public AuthorService(AuthorRepository authorRepository) {
         this.authorRepository = authorRepository;
     }

     // Add methods to interact with the authorRepository as needed
     public Author save(Author author) {
         return authorRepository.save(author);
     }
     public Optional<Author> findByUsername(String username) {
         return authorRepository.findByUsername(username);
     }

     public void delete(Author author) {
        authorRepository.delete(author);
     }

}
