package com.ceteq.biblioteca.service;

import java.util.List;

import com.ceteq.biblioteca.bean.LibroBean;

public interface LibroService {

	public String createLibro(LibroBean libroBean);

	public LibroBean findByID(Integer id);

	List<LibroBean> findAll();

	public Boolean updateLibro(LibroBean libroBean);

	public Boolean deleteLibro(Integer id);

}
