package com.ceteq.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceteq.biblioteca.bean.AutorBean;
import com.ceteq.biblioteca.service.AutoresService;

@RestController
@RequestMapping("/libros")
public class LibrosController {

	@Autowired
	private AutoresService autoresService;

	@PostMapping(path = "/create")
	public ResponseEntity<?> agregar(@Validated @RequestBody AutorBean autorBean, BindingResult result) {
		return new ResponseEntity<>(this.autoresService.createAutor(autorBean), HttpStatus.OK);

	}

	@GetMapping(path = "/findById/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.autoresService.findById(id), HttpStatus.OK);
	}

	@GetMapping(path = "/findAll")
	public ResponseEntity<?> mostrar() {
		return new ResponseEntity<>(this.autoresService.findAll(), HttpStatus.OK);
	}

	@DeleteMapping("/deleteId/{id}")
	public ResponseEntity<Boolean> eliminar(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.autoresService.deleteAutor(id), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarUsuario(@Validated @RequestBody AutorBean autorBean) {
		return new ResponseEntity<>(this.autoresService.updateAutor(autorBean), HttpStatus.OK);
	}
}
