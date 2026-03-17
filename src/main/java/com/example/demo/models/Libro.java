package com.example.demo.models;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Libro {
    private long id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fecha;
    private String autor;
}
