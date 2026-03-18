package com.example.demo.services;

import com.example.demo.models.Libro;
import com.example.demo.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service

public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    @Transactional(readOnly = true)
    public List<Libro> getAll() {
        return this.libroRepository.findAll();
    }

    public Libro getLibroById(long id){
        return this.libroRepository.findById(id);
    }

    public Libro getLibroByIsbn(String isbn){

        return this.libroRepository.findByisbn(isbn);
    }

    public Libro save(Libro libroNew){
        return this.libroRepository.save(libroNew);

    }

    public Libro update(Libro libroUpdate){
        return this.libroRepository.update(libroUpdate);
    }

    public void delete(Long id){
        this.libroRepository.deleteById(id);
    }
}
