package com.example.demo.controllers;


import com.example.demo.models.Libro;
import com.example.demo.services.LibroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public ResponseEntity<List<Libro>> findAll(){
        List<Libro> libros = this.libroSerive.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(libros);
    }

    @PostMapping
    public ResponseEntity<Libro> Save(@Valid @RequestBody Libro libro){

    }



}
