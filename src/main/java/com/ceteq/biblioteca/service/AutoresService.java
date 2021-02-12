package com.ceteq.biblioteca.service;

import java.util.List;

import com.ceteq.biblioteca.bean.AutorBean;

public interface AutoresService {

	public String createAutor(AutorBean autorBean);
	
	public Boolean saveAutoresList(List<AutorBean> autorBeansList);

	public AutorBean findById(Integer id);

	List<AutorBean> findAll();

	public Boolean updateAutor(AutorBean autorBean);

	public Boolean deleteAutor(Integer id);

}
