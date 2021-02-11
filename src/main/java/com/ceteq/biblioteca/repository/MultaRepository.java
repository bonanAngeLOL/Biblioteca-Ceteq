package com.ceteq.biblioteca.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ceteq.biblioteca.model.MultaModel;
@Repository
public interface MultaRepository extends JpaRepository<MultaModel, Integer> {

}
