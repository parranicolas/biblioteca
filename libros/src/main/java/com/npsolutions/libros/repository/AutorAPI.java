package com.npsolutions.libros.repository;

import com.npsolutions.libros.model.Autor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "autorapi", url="http://localhost:9004/autores")
public interface AutorAPI {
    
    @GetMapping("/autorporlibro/{idLibro}")
    public Autor getAutorByLibro(@PathVariable("idLibro") Integer idLibro);
    
}
