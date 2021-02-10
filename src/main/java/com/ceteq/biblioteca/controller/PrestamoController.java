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
import com.ceteq.biblioteca.bean.PrestamoBean;
import com.ceteq.biblioteca.service.PrestamoService;



@RestController
@RequestMapping("/prestamos")
public class PrestamoController {
	
	@Autowired
	private PrestamoService prestamoService;
	
	@PostMapping(path = "/create")
	public ResponseEntity<?> agregar(@Validated @RequestBody PrestamoBean prestamoBean, BindingResult result) {
		return new ResponseEntity<>(this.prestamoService.createPrestamo(prestamoBean), HttpStatus.OK);

	}
	

	@GetMapping(path = "/findById/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.prestamoService.findById(id), HttpStatus.OK);
	}

	@GetMapping(path = "/findAll")
	public ResponseEntity<?> mostrar() {
		return new ResponseEntity<>(this.prestamoService.findAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteId/{id}")
	public ResponseEntity<Boolean> eliminar(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.prestamoService.deletePrestamo(id), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarUsuario(@Validated @RequestBody PrestamoBean autorBean) {
		return new ResponseEntity<>(this.prestamoService.updatePrestamo(autorBean), HttpStatus.OK);

}
	
}


