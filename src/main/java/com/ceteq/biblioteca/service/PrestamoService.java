package com.ceteq.biblioteca.service;

import java.util.List;

import com.ceteq.biblioteca.bean.PrestamoBean;

public interface PrestamoService {

	public String createPrestamo(PrestamoBean prestamoBean);

	public PrestamoBean findById(Integer id);

	List<PrestamoBean> findAll();

	public Boolean updatePrestamo(PrestamoBean prestamoBean);

	public Boolean deletePrestamo(Integer id);
	
	public List<?>  findAllPrestamos();
	public List<?> findAllLibrosPrestados();
}
