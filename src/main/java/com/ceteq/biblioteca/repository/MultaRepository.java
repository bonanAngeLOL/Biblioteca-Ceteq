package com.ceteq.biblioteca.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.ceteq.biblioteca.model.MultaModel;

public interface MultaRepository extends JpaRepository<MultaModel, Integer> {

}
