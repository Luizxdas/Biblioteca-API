package com.biblioteca.Biblioteca.controller.dto;

import com.biblioteca.Biblioteca.entities.Credits;

public record CreditsDTO(Integer book_id, String image_source, String image_author, String image_license, String text_source, String text_license, Boolean modified) {
    public CreditsDTO(Credits credits) {
        this(
                credits.getBook_id(),
                credits.getImage_source(),
                credits.getImage_author(),
                credits.getImage_license(),
                credits.getText_source(),
                credits.getText_license(),
                credits.getModified()
        );
    }
}
