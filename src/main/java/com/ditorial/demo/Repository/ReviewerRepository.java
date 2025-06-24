package com.ditorial.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditorial.demo.Model.Reviewer;

public interface ReviewerRepository extends JpaRepository<Reviewer, Long> {
    // Additional query methods can be defined here if needed
}
