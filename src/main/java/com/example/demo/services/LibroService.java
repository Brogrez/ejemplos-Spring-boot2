package com.example.demo.services;

import com.example.demo.models.Libro;
import com.example.demo.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class LibroService {
    @Autowired
    private LibroRepository libroRepository;


    public List<Libro> getAll(){
        return this.libroRepository.findAll();
    }

    public Libro getLibroById(long id){
        return null;
    }

    public Libro getLibroByIsbn(String isbn){
        return null;
    }

    public Libro save(Libro libroNew){
        return this.libroRepository.save(libroNew);

    }

    public Libro update(Libro libroUpdate){
        return null;
    }

    public void delete(Long id){

    }
}
