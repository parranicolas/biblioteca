package com.npsolutions.autores.controller;

import com.npsolutions.autores.model.Autor;
import com.npsolutions.autores.service.IAutorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autores")
public class AutorController {
    
    @Autowired
    private IAutorService autorServ;
    
    @PostMapping("/crear")
    public String crearAutor(@RequestBody Autor autor){
        autorServ.setAutor(autor);
        return "Autor creado correctamente.";
    }
    
    @GetMapping("/traer")
    public List<Autor> traerAutores(){
        return autorServ.getAutores();
    }
    
    @DeleteMapping("/borrar/{idAutor}")
    public String borrarAutor(@PathVariable Long idAutor){
        autorServ.deleteAutor(idAutor);
        return "Autor eliminado correctamente.";
    }
    
    @PutMapping("/editar/{idAutor}")
    public String editarAutor(@PathVariable Long idAutor, @RequestBody Autor autor){
        autorServ.editAutor(idAutor, autor);
        return "Autor editado correctamente.";
    }
    
    @GetMapping("/autorporlibro/{idLibro}")
    public List<Autor> traerAutorByName(@PathVariable("idLibro") Long idLibro){
        return autorServ.findAutorByLibro(idLibro);
    }
    
}
