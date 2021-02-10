package com.ceteq.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceteq.biblioteca.model.PrestamoModel;

@Repository
public interface PrestamoRepository extends JpaRepository<PrestamoModel,Integer > {

}
