package com.biblioteca.Biblioteca.entities;

import com.biblioteca.Biblioteca.controller.dto.BookRequestDTO;
import com.biblioteca.Biblioteca.controller.dto.CreditsDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "credits")
@Entity(name = "credits")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "book_id")
public class Credits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;
    private String image_source;
    private String image_author;
    private String image_license;
    private String text_source;
    private String text_license;
    private Boolean modified;

    public Credits(CreditsDTO data) {
        this.book_id = data.book_id();
        this.image_source = data.image_source();
        this.image_author = data.image_author();
        this.image_license = data.image_license();
        this.text_source= data.text_source();
        this.text_license = data.text_license();
        this.modified = data.modified();
    }
}
