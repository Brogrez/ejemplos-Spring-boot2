package com.example.demo.controllers;


import com.example.demo.models.Libro;
import com.example.demo.services.LibroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
@Validated
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public ResponseEntity<List<Libro>> findAll(){
        List<Libro> libros = this.libroService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(libros);
    }

    public ResponseEntity<Libro> findByid(@PathVariable Long id){
        Libro libro = this.libroService.getLibroById(id);
        return ResponseEntity.status(HttpStatus.OK).body(libro);
    }

    @PostMapping
    public ResponseEntity<Libro> Save(@Valid @RequestBody Libro libro){
        return ResponseEntity.status(HttpStatus.CREATED).body(
                this.libroService.save(libro)
        );
    }

    @PutMapping
    public ResponseEntity<Libro> update(@Valid @RequestBody Libro libro){
        return ResponseEntity.status(HttpStatus.OK).body(
          this.libroService.update(libro)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletedById(@PathVariable Long id){
        this.libroService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }




}
