package com.biblioteca.Biblioteca.entities;

import com.biblioteca.Biblioteca.controller.dto.BookRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "books")
@Entity(name = "books")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private String author;
    private List<String> genres;
    private Integer year;
    private String synopsis;

    public Book (BookRequestDTO data) {
        this.title = data.title();
        this.image = data.image();
        this.author = data.author();
        this.genres = data.genres();
        this.year = data.year();
        this.synopsis = data.synopsis();
    }
}
