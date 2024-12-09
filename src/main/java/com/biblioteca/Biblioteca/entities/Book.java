package com.biblioteca.Biblioteca.entities;

import com.biblioteca.Biblioteca.controller.dto.BookRequestDTO;
import jakarta.persistence.*;

import java.util.List;

@Table(name = "books")
@Entity(name = "books")
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

    public Book() {
    }

    public Book(Long id, String title, String image, String author, List<String> genres, Integer year, String synopsis) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.author = author;
        this.genres = genres;
        this.year = year;
        this.synopsis = synopsis;
    }

    public Book(BookRequestDTO data) {
        this.title = data.title();
        this.image = data.image();
        this.author = data.author();
        this.genres = data.genres();
        this.year = data.year();
        this.synopsis = data.synopsis();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getGenres() {
        return genres;
    }

    public Integer getYear() {
        return year;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
