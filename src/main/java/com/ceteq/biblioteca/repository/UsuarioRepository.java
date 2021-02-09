package com.ceteq.biblioteca.repository;

import com.ceteq.biblioteca.model.UsuarioModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer>{



}
