package com.biblioteca.Biblioteca.controller.dto;

import java.util.List;

public record BookRequestDTO(String title, String image, String author, List<String> genres, Integer year, String synopsis) {
}
