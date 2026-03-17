package com.example.demo.repositories;

import com.example.demo.models.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    //lista de libros
    private List<Libro> listaLibros = new ArrayList<>();

    //obtener todos los libros
    public List<Libro> findAll() {
        return this.listaLibros;
    }
    //obtener libros por id
    public Libro findById(Long id) {
        for (Libro libro : this.listaLibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
    // Obtener libros por isbn
    public Libro findByisbn(String isbn) {
        for (Libro libro : this.listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    //guardar libros
    public Libro save(Libro libro){
        this.listaLibros.add(libro);
        return libro;
    }

    //actualizar
    public Libro update(Libro libro){
        long id = 0l:
        int posicion = 0;

        for(int i = 0 ; i < this.listaLibros.size() ; i++){
            if(this.listaLibros.get(i).getId() == libro.getId()){
                id = this.listaLibros.get(i).getId();
                posicion = i;
            }
        }

        this.listaLibros.set(posicion, libro);
        return libro;
    }
    //eliminar

    public void deleteById(Long id){
        Libro libro = this.findById(id);
        if(libro != null){
            this.listaLibros.remove(libro);
        }
    }





}
