package com.ceteq.biblioteca.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.ceteq.biblioteca.bean.UsuarioBean;
import com.ceteq.biblioteca.bean.projection.DeudorProjection;
import com.ceteq.biblioteca.model.UsuarioModel;
import com.ceteq.biblioteca.repository.UsuarioRepository;
import com.ceteq.biblioteca.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepo;

   

    @Override
    public List<UsuarioBean> findAll() {
        List<UsuarioModel> usuarios = usuarioRepo.findAll();
        List<UsuarioBean> usuariosBean = new ArrayList<>();
        for(UsuarioModel usuario : usuarios) {
            UsuarioBean usuarioBean = new UsuarioBean(
                    usuario.getIdUsuario(), 
                    usuario.getNombre(), 
                    usuario.getApellidos(),
                    usuario.getCurp(), 
                    usuario.getFechaNacimiento(),
                    usuario.getTelefono(), 
                    usuario.getDirecion(), 
                    usuario.getCorreo()
            );
            usuariosBean.add(usuarioBean);
        }
        return usuariosBean;
    }

    @Override
    public UsuarioBean findById(int idUsuario) {
        UsuarioModel usuario = usuarioRepo.findById(idUsuario).orElseThrow();
        UsuarioBean usuarioBean = new UsuarioBean(
                usuario.getIdUsuario(), 
                usuario.getNombre(), 
                usuario.getApellidos(),
                usuario.getCurp(), 
                usuario.getFechaNacimiento(),
                usuario.getTelefono(), 
                usuario.getDirecion(), 
                usuario.getCorreo()
        );
        return usuarioBean;
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

    @Override
    public boolean deleteById(Integer idUsuario) {
        usuarioRepo.deleteById(idUsuario);
        return true;
    }

    @Override
    public List<DeudorProjection> getDeudores() {
        return usuarioRepo.getDeudores();
    }


}
