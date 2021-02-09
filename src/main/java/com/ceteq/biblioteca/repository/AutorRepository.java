package com.ceteq.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceteq.biblioteca.model.AutorModel;

@Repository
public interface AutorRepository extends JpaRepository<AutorModel, Integer> {

}
