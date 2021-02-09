package com.ceteq.biblioteca.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.ceteq.biblioteca.bean.UsuarioBean;
import com.ceteq.biblioteca.model.UsuarioModel;
import com.ceteq.biblioteca.repository.UsuarioRepository;
import com.ceteq.biblioteca.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepo;


    @Override
    public void deleteById(int idUsuario) {
        usuarioRepo.deleteById(idUsuario);
    }

    @Override
    public List<UsuarioBean> findAll() {
        List<UsuarioModel> usuarios = usuarioRepo.findAll();
        List<UsuarioBean> usuariosBean = new ArrayList<>();
        for(UsuarioModel usuario : usuarios) {
            UsuarioBean usuarioBean = new UsuarioBean();
            usuarioBean.setIdUsuario(usuario.getIdUsuario());
            usuarioBean.setNombre(usuario.getNombre());
            usuarioBean.setApellidos(usuario.getApellidos());
            usuarioBean.setCurp(usuario.getCurp());
            usuarioBean.setFechaNacimiento(usuario.getFechaNacimiento());
            usuarioBean.setTelefono(usuario.getTelefono());
            
            usuarioBean.setDireccion(usuario.getDirecion());
            usuarioBean.setEmail(usuario.getCorreo());
        }
        return usuariosBean;
    }

    @Override
    public UsuarioBean findById(int idUsuario) {
        UsuarioModel usuario = usuarioRepo.findById(idUsuario).orElseThrow();
        UsuarioBean userBean = new UsuarioBean();

        userBean.setIdUsuario(usuario.getIdUsuario());
        userBean.setNombre(usuario.getNombre());
        userBean.setApellidos(usuario.getApellidos());
        userBean.setCurp(usuario.getCurp());
        userBean.setFechaNacimiento(usuario.getFechaNacimiento());
        userBean.setTelefono(usuario.getTelefono());
        userBean.setDireccion(usuario.getDirecion());
        userBean.setEmail(usuario.getCorreo());

        return userBean;
    }

    @Override
    public boolean save(UsuarioBean usuario) {
        UsuarioModel usuarioM = new UsuarioModel(
                usuario.getIdUsuario(), 
                usuario.getNombre(), 
                usuario.getApellidos(),
                usuario.getCurp(), 
                usuario.getFechaNacimiento(), 
                usuario.getTelefono(), 
                usuario.getDireccion(),
                usuario.getEmail());
        
        usuarioRepo.save(usuarioM);
        return true;
    }

}
