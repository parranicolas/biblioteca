package com.npsolutions.libros.service;

import com.npsolutions.libros.model.Libro;
import java.util.List;


public interface ILibroService {
    
        
    public List<Libro> getLibros();
    
    public void saveLibro(Libro libro);
    
    public void deleteLibro(Integer idLibro);
    
    public void findLibro(Integer idLibro);
    
    public Libro editLibro(Integer id, Libro libro);
    
    
    
}
