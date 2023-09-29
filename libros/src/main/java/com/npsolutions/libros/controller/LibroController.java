package com.npsolutions.libros.controller;

import com.npsolutions.libros.model.Libro;
import com.npsolutions.libros.service.ILibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
public class LibroController {
    
    @Autowired
    private ILibroService libroServ;
    
    @PostMapping("/crear")
    public String crearLibro(@RequestBody Libro libro){
        libroServ.saveLibro(libro);
        return "Libro creado exitosamente.";
    }
    
    @GetMapping("/traer")
    public List<Libro> traerLibros(){
        return libroServ.getLibros();
    }
    
    
}
