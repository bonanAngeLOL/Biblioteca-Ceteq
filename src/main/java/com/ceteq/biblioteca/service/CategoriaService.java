package com.ceteq.biblioteca.service;

import java.util.List;

import com.ceteq.biblioteca.bean.CategoriaBean;

public interface CategoriaService {
	public String createCategoria(CategoriaBean categoriaBean);//Crear

	public CategoriaBean findByID(Integer id);//Buscar por ID

	List<CategoriaBean> findAll();//Buscar Todos

	public Boolean updateCategoria(CategoriaBean categoriaBean);//Actualizar

	public Boolean deleteCategoria(Integer id_categoria);//Borrar
}
