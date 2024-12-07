package com.biblioteca.Biblioteca.repositories;

import com.biblioteca.Biblioteca.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
