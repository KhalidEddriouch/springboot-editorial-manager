package com.ditorial.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditorial.demo.Model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    // Additional query methods can be defined here if needed
}
