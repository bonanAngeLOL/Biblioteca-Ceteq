package com.ceteq.biblioteca.service;

import java.util.List;

import com.ceteq.biblioteca.bean.LibroBean;
import com.ceteq.biblioteca.bean.projection.LibroIdNombre;

public interface LibroService {

	public String createLibro(LibroBean libroBean);

	public LibroBean findByID(Integer id);

	public List<LibroBean> findAll();

	public Boolean updateLibro(LibroBean libroBean);

	public Boolean deleteLibro(Integer id);

    public List<LibroIdNombre> getLibroByNombreAutor(String NombreAutor);

}
