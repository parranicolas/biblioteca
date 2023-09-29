package com.npsolutions.autores.repository;

import com.npsolutions.autores.model.Autor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends JpaRepository<Autor, Long> {
    
    @Query("SELECT a FROM Autor a WHERE :idLibro MEMBER OF a.id_libros")
    List<Autor> findAutorByLibro(Long idLibro);
    
}
