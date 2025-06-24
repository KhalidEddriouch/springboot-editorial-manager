package com.ditorial.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditorial.demo.Model.Editor;

public interface EditorRepository extends JpaRepository<Editor, String> {
    // Additional query methods can be defined here if needed
    
}
