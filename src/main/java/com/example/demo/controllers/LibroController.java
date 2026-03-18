package com.example.demo.controllers;


import com.example.demo.models.Libro;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @GetMapping
    public ResponseEntity<List<Libro>> findAll(){
        List<Libro> libros = this.libroSerive.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(libros);
    }



}
