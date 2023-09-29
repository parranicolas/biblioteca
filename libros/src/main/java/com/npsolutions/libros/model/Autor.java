package com.npsolutions.libros.model;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class Autor {
    

    private Long idAutor;
    private String nombreAutor;
    private LocalDate fechaNac;
    private String nacionalidad;
    private List<Integer> idLibros;
    
}
