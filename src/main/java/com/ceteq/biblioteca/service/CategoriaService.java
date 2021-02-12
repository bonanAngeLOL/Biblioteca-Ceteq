package com.ceteq.biblioteca.service;

import java.util.List;

import com.ceteq.biblioteca.bean.CategoriaBean;

public interface CategoriaService {

	public String createCategoria(CategoriaBean categoriaBean);

	public Boolean saveCategoriaList(List<CategoriaBean> categoriaBeansList);

	public CategoriaBean findByID(Integer id);

	List<CategoriaBean> findAll();

	public Boolean updateCategoria(CategoriaBean categoriaBean);

	public Boolean deleteCategoria(Integer id_categoria);
}
