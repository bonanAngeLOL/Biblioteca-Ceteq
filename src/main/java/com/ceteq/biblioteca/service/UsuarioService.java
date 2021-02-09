package com.ceteq.biblioteca.service;

import java.util.List;

import com.ceteq.biblioteca.bean.UsuarioBean;

public interface UsuarioService{
    
    public boolean save(UsuarioBean usuario);

    public UsuarioBean findById(int idUsuario);

    public List<UsuarioBean> findAll();

    public void deleteById(int idUsuario);
    
}
