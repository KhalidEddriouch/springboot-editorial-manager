package com.ditorial.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ditorial.demo.Model.Author;
import com.ditorial.demo.Service.AuthorService;

@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @PostMapping
    public Author createAuthor(Author author) {
        return service.save(author);
    }

    @GetMapping("/{username}")
    public ResponseEntity<Author> getAuthorByUsername(@PathVariable String username) {
        return service.findByUsername(username)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{username}")
    public ResponseEntity<Void> deleteAuthor(@PathVariable String username) {
        service.findByUsername(username)
                .ifPresent(author -> {
                    service.delete(author);
                });
        return ResponseEntity.noContent().build();
    }


}
