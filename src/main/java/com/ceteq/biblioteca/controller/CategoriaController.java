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

import com.ceteq.biblioteca.bean.CategoriaBean;
import com.ceteq.biblioteca.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@PostMapping(path = "/create")
	public ResponseEntity<?> createCategoria(@Validated @RequestBody CategoriaBean categoriaBean,
	BindingResult result){
	return new ResponseEntity<>(this.categoriaService.createCategoria(categoriaBean), HttpStatus.OK);	
	}
	
	@GetMapping(path = "/findByID/{id}")
	public ResponseEntity<?> findByIdCategoria(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.categoriaService.findByID(id), HttpStatus.OK);
	}
	
	@GetMapping(path = "/findAll")
	public ResponseEntity<?> findAllCategoria(){
		return new ResponseEntity<>(this.categoriaService.findAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteId/{id}")
	public ResponseEntity<Boolean> deleteCategoria(@PathVariable("id") Integer id){
	      return new ResponseEntity<>(this.categoriaService.deleteCategoria(id), HttpStatus.OK);	
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateCategoria(@Validated @RequestBody CategoriaBean categoriaBean){
		return new ResponseEntity<>(this.categoriaService.updateCategoria(categoriaBean), HttpStatus.OK);
	}
}
