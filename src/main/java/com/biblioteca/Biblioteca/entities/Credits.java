package com.biblioteca.Biblioteca.entities;

import com.biblioteca.Biblioteca.controller.dto.CreditsDTO;
import jakarta.persistence.*;

@Table(name = "credits")
@Entity(name = "credits")
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

    public Credits() {
    }

    public Credits(Integer book_id, String image_source, String image_author, String image_license, String text_source, String text_license, Boolean modified) {
        this.book_id = book_id;
        this.image_source = image_source;
        this.image_author = image_author;
        this.image_license = image_license;
        this.text_source = text_source;
        this.text_license = text_license;
        this.modified = modified;
    }

    public Credits(CreditsDTO data) {
        this.book_id = data.book_id();
        this.image_source = data.image_source();
        this.image_author = data.image_author();
        this.image_license = data.image_license();
        this.text_source = data.text_source();
        this.text_license = data.text_license();
        this.modified = data.modified();
    }

    public Integer getBook_id() {
        return book_id;
    }

    public String getImage_source() {
        return image_source;
    }

    public String getImage_author() {
        return image_author;
    }

    public String getImage_license() {
        return image_license;
    }

    public String getText_source() {
        return text_source;
    }

    public String getText_license() {
        return text_license;
    }

    public Boolean getModified() {
        return modified;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public void setImage_source(String image_source) {
        this.image_source = image_source;
    }

    public void setImage_author(String image_author) {
        this.image_author = image_author;
    }

    public void setImage_license(String image_license) {
        this.image_license = image_license;
    }

    public void setText_source(String text_source) {
        this.text_source = text_source;
    }

    public void setText_license(String text_license) {
        this.text_license = text_license;
    }

    public void setModified(Boolean modified) {
        this.modified = modified;
    }
}
