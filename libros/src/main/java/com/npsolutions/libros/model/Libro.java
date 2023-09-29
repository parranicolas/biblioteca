package com.npsolutions.libros.model;

import com.npsolutions.libros.dto.AutorDTO;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLibro;
    private String titulo;
    private String añoPublicacion;
    private String descripcion;
    
    @ElementCollection(fetch = FetchType.EAGER)
    private List<AutorDTO> listaAutores;
            
    
    
}