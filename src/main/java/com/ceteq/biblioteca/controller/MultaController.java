package com.ceteq.biblioteca.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceteq.biblioteca.bean.MultaBean;
import com.ceteq.biblioteca.serviceImpl.MultaServiceImpl;

@RestController
@RequestMapping("/multas")
public class MultaController {
@Autowired
private MultaServiceImpl multaService;

@PostMapping("/crear")
public ResponseEntity<String> creaMulta( @RequestBody MultaBean multaBean){
	return new ResponseEntity<String>(this.multaService.createMulta(multaBean), HttpStatus.OK);
}

@PutMapping("/actualiza")
public ResponseEntity<String> updateMulta(@Validated @RequestBody MultaBean multaBean){
	return new ResponseEntity<String>(this.multaService.updateMulta(multaBean), HttpStatus.OK); 
}

@GetMapping("/vermulta/{idMulta}")
public ResponseEntity<MultaBean> getMulta(@PathVariable int idMulta){
	return new ResponseEntity<MultaBean>(this.multaService.getMulta(idMulta), HttpStatus.OK);
}

@GetMapping("/vermultas")
public ResponseEntity<List<MultaBean>> listAllAutor() {
	return new ResponseEntity<List<MultaBean>>(this.multaService.getAllMulta(), HttpStatus.OK);
}

@DeleteMapping("/borrar/{idMulta}")
public ResponseEntity<String>deleteMulta(@PathVariable int idMulta){
	return new ResponseEntity<String>(this.multaService.deleteMulta(idMulta), HttpStatus.OK);
}

}
