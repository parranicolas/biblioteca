package com.npsolutions.libros.service;

import com.npsolutions.libros.dto.AutorDTO;
import com.npsolutions.libros.model.Autor;
import com.npsolutions.libros.model.Libro;
import com.npsolutions.libros.repository.AutorAPI;
import com.npsolutions.libros.repository.ILibroRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService implements ILibroService {
    
    @Autowired
    private ILibroRepository libroRepo;
    
    @Autowired
    private AutorAPI autorAPI;

    @Override
    public List<Libro> getLibros() {
        return libroRepo.findAll();
    }

    @Override
    public void saveLibro(Libro libro) {
        AutorDTO aut = new AutorDTO();
        List<AutorDTO> listaAutoresDTO = new ArrayList<>();
        List<Autor>listaAutores = autorAPI.getAutorByLibro(libro.getIdLibro());
        for(Autor a : listaAutores){
            aut.setNombreAutor(a.getNombreAutor());
            aut.setNacionalidad(a.getNacionalidad());
            listaAutoresDTO.add(aut);
        }                              
        libro.setListaAutores(listaAutoresDTO);
        libroRepo.save(libro);
    }

    @Override
    public void deleteLibro(Integer idLibro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void findLibro(Integer idLibro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Libro editLibro(Integer id, Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
