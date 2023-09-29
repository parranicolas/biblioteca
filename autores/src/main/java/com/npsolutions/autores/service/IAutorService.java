package com.npsolutions.autores.service;

import com.npsolutions.autores.model.Autor;
import java.util.List;


public interface IAutorService {
    
    public List<Autor> getAutores();
    
    public void setAutor(Autor autor);
    
    public void deleteAutor(Long idAutor);
    
    public void editAutor(Long id, Autor autor);
    
    public List<Autor> findAutorByLibro(Long idLibro);
}
