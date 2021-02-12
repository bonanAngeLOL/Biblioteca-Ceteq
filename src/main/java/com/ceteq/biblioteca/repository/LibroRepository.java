package com.ceteq.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.ceteq.biblioteca.bean.projection.LibroIdNombre;
import com.ceteq.biblioteca.model.LibroModel;

@Repository
public interface LibroRepository extends JpaRepository<LibroModel, Integer> {

    @Transactional
    @Query(
        value = 
        "    select "+
        "        l.id_libro as idLibro,"+
        "        l.nombre"+
        "    from "+
        "        b_libros l "+
        "    where "+
        "        l.id_autor = ("+
        "            select "+
        "                a.id_autor "+
        "            from "+
        "                b_autores a "+
        "            where "+
        "                concat("+
        "                    a.nombre, "+
        "                    \" \", "+
        "                    a.apellidos"+
        "                ) = :NombreAutor"+
        "            )",
        nativeQuery = true
    )
    List<LibroIdNombre> getLibroByNombreAutor(@Param("NombreAutor") String NombreAutor);

}
