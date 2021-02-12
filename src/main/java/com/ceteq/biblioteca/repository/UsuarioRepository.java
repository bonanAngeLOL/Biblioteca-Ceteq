package com.ceteq.biblioteca.repository;

import java.util.List;

import com.ceteq.biblioteca.bean.projection.DeudorProjection;
import com.ceteq.biblioteca.model.UsuarioModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer>{

    @Transactional
    @Query(
        value = 
        "    select "+
        "        u.id_usuario as idUsuario,"+
        "        p.id_prestamo as idPrestamo,"+
        "        concat_ws("+
        "            \" \", "+
        "            u.usuario, "+
        "            u.apellidos"+
        "        ) as Usuario, "+
        "        p.fecha_prestamo, "+
        "        date_add("+
        "            p.fecha_prestamo, "+
        "            interval 5 day"+
        "        ) as fecha_limite, "+
        "        concat(\"$ \", "+
        "            datediff("+
        "                now(), "+
        "                p.fecha_prestamo"+
        "            ) * 5"+
        "        ) as multa "+
        "    from "+
        "        b_prestamos p, "+
        "        b_usuarios u "+
        "    where "+
        "        p.fecha_entrega is null and "+
        "        u.id_usuario = p.id_usuario and "+
        "        date_add("+
        "            p.fecha_prestamo, "+
        "            interval 5 day"+
        "        ) < now()",
        nativeQuery = true
    )
    List<DeudorProjection> getDeudores();

}
