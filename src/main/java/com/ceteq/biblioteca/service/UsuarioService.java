package com.ceteq.biblioteca.service;

import java.util.List;

import com.ceteq.biblioteca.bean.UsuarioBean;
import com.ceteq.biblioteca.bean.projection.DeudorProjection;

public interface UsuarioService{
    
    public boolean save(UsuarioBean usuario);

    public UsuarioBean findById(int idUsuario);

    public List<UsuarioBean> findAll();
    
    public boolean deleteById(Integer idUsuario);

    public List<DeudorProjection> getDeudores();
    
}
