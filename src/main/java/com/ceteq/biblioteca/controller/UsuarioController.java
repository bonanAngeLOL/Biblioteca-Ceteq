package com.ceteq.biblioteca.controller;

import java.util.List;

import com.ceteq.biblioteca.bean.UsuarioBean;
import com.ceteq.biblioteca.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController{

    @Autowired
    private UsuarioService usuarioServ;

    @PostMapping
    public ResponseEntity<UsuarioBean> create(@RequestBody UsuarioBean usuario){
        usuario.setIdUsuario(0);
        usuarioServ.save(usuario);
        return new ResponseEntity<UsuarioBean>(usuario, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioBean>> getAll(){
        List<UsuarioBean> usuarios = usuarioServ.findAll();
        return new ResponseEntity<List<UsuarioBean>>(usuarios, HttpStatus.OK);
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<UsuarioBean> findById(@PathVariable int idUsuario){
        UsuarioBean user = usuarioServ.findById(idUsuario);
        return new ResponseEntity<UsuarioBean>(user, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<UsuarioBean> update(@RequestBody UsuarioBean usuario){
        usuarioServ.save(usuario);
        return new ResponseEntity<UsuarioBean>(usuario, HttpStatus.OK);
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable Integer idUsuario){
        usuarioServ.deleteById(idUsuario);
        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }

}
