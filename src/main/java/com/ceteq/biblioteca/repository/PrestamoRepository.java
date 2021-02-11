package com.ceteq.biblioteca.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ceteq.biblioteca.model.PrestamoModel;

@Repository
public interface PrestamoRepository extends JpaRepository<PrestamoModel,Integer > {
	@Transactional
	@Query(value="SELECT p.id_libro, l.nombre from db_biblio_ceteq.b_prestamos p, db_biblio_ceteq.b_libros l where p.fecha_prestamo IS NOT NULL AND  l.id_libro = p.id_libro;", nativeQuery=true)
	List<?> findAllPrestamos();
	@Query(value="SELECT u.id_usuario, u.usuario, u.apellidos,  count(*) as libros_prestados FROM db_biblio_ceteq.b_prestamos p, db_biblio_ceteq.b_usuarios u where u.id_usuario = p.id_usuario group by p.id_usuario;", nativeQuery=true)
	List<?> findAllLibrosPrestados();
}
