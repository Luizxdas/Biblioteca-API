package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.controller.dto.BookResponseDTO;
import com.biblioteca.Biblioteca.controller.dto.CreditsDTO;
import com.biblioteca.Biblioteca.repositories.BookRepository;
import com.biblioteca.Biblioteca.repositories.CreditsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"https://localhost:5173", "https://biblioteca-nu-dusky.vercel.app"})
@RequestMapping("/books")
public class LibraryController {

    private final BookRepository bookRepository;
    private final CreditsRepository creditsRepository;

    public LibraryController(BookRepository bookRepository, CreditsRepository creditsRepository) {
        this.bookRepository = bookRepository;
        this.creditsRepository = creditsRepository;
    }

    @GetMapping
    public List<BookResponseDTO> getAll(){
        return bookRepository.findAll().stream().map(BookResponseDTO::new).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDTO> getBook(@PathVariable int id) {
        if (id <= 0) {
            return ResponseEntity.badRequest().build();
        }

        return bookRepository.findById(id)
                .map(book -> ResponseEntity.ok(new BookResponseDTO(book)))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping("/credits/{id}")
    public ResponseEntity<CreditsDTO> getCredits(@PathVariable int id) {
        if (id <= 0) {
            return ResponseEntity.badRequest().build();
        }

        return creditsRepository.findById(id)
                .map(credits -> ResponseEntity.ok(new CreditsDTO(credits)))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}