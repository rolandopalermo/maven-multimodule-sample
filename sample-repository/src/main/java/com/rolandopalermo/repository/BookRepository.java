package com.rolandopalermo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rolandopalermo.repository.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}