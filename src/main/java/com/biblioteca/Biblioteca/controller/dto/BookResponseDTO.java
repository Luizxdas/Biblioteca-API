package com.biblioteca.Biblioteca.controller.dto;

import com.biblioteca.Biblioteca.entities.Book;

import java.util.List;

public record BookResponseDTO(Long id, String title, String image, String author, List<String> genres, Integer year, String synopsis) {
    public BookResponseDTO (Book book){
        this(book.getId(), book.getTitle(), book.getImage(), book.getAuthor(), book.getGenres(), book.getYear(), book.getSynopsis());
    }
}
