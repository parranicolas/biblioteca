package com.npsolutions.autores.service;

import com.npsolutions.autores.model.Autor;
import com.npsolutions.autores.repository.IAutorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService implements IAutorService {
    
    @Autowired
    private IAutorRepository autorRepo;

    @Override
    public List<Autor> getAutores() {

        return autorRepo.findAll();
    }

    @Override
    public void setAutor(Autor autor) {
        autorRepo.save(autor);
    }

    @Override
    public void deleteAutor(Long idAutor) {
        autorRepo.deleteById(idAutor);
    }

    @Override
    public void editAutor(Long id, Autor autor) {
        Autor aut = autorRepo.findById(id).orElse(autor);
        aut.setNombreAutor(autor.getNombreAutor());
        aut.setFechaNac(autor.getFechaNac());
        aut.setNacionalidad(autor.getNacionalidad());
        aut.setId_libros(autor.getId_libros());
    }


    @Override
    public List<Autor> findAutorByLibro(Long idLibro) {
        return autorRepo.findAutorByLibro(idLibro);
    }
    
}
