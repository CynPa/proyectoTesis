package com.unir.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unir.main.model.Odontograma;
import com.unir.main.model.OdontogramaRequest;
import com.unir.main.service.ConsultorioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class OdontogramaController  {
	
	@Autowired
	ConsultorioService consultorio;
	
	@PostMapping(path = "/consultario/Odontogram")
    public ResponseEntity<Odontograma> insertar(@RequestBody OdontogramaRequest request) {
		Odontograma odontograma=consultorio.insertarOdontograma(request);
		
		if( odontograma !=null)
		{
			return ResponseEntity.status(HttpStatus.CREATED).body(odontograma);
		}
		else
		{
			return ResponseEntity.badRequest().build();
		}
		
	}
	
	

}
