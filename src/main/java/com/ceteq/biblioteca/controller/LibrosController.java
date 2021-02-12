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

import com.ceteq.biblioteca.bean.LibroBean;
import com.ceteq.biblioteca.service.LibroService;

@RestController
@RequestMapping("/libros")
public class LibrosController {

	@Autowired
	private LibroService libroService;

	@PostMapping(path = "/create")
	public ResponseEntity<?> agregar(@Validated @RequestBody LibroBean libroBean, BindingResult result) {
		return new ResponseEntity<>(this.libroService.createLibro(libroBean), HttpStatus.OK);

	}

	@GetMapping(path = "/findById/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.libroService.findByID(id), HttpStatus.OK);
	}

	@GetMapping(path = "/findAll")
	public ResponseEntity<?> findAll() {
		return new ResponseEntity<>(this.libroService.findAll(), HttpStatus.OK);
	}

	@DeleteMapping("/deleteId/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.libroService.deleteLibro(id), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarLibro(@Validated @RequestBody LibroBean libroBean) {
		return new ResponseEntity<>(this.libroService.updateLibro(libroBean), HttpStatus.OK);

	}

    @GetMapping("/autor/{NombreAutor}")
    public ResponseEntity<?> listLibrosByAutorName(@PathVariable String NombreAutor){
        String searchStr = NombreAutor.replaceAll("-", " ");
        return new ResponseEntity<>(
                    this.libroService.getLibroByNombreAutor(
                            searchStr
                        ),
                    HttpStatus.OK
                );
    }
	
	/*
	@GetMapping(path = "/libroscategoria")
	public ResponseEntity<?> findByCategory() {
		return new ResponseEntity<>(this.libroService.findByCategory(), HttpStatus.OK);
	}*/

	
}
