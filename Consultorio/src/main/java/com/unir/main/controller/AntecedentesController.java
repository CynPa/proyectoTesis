package com.unir.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unir.main.model.Antecedentes;
import com.unir.main.model.AntecedentesRequest;
import com.unir.main.model.Odontograma;
import com.unir.main.model.OdontogramaRequest;
import com.unir.main.service.AntecedentesService;
import com.unir.main.service.ConsultorioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class AntecedentesController {
	@Autowired
	AntecedentesService antecedentes;
	
	@PostMapping(path = "/consultario/Antecedentes")
    public ResponseEntity<Antecedentes> insertar(@RequestBody AntecedentesRequest request) {
		Antecedentes antecedentes1=antecedentes.insertarAntecedentes(request);
		
		if( antecedentes1 !=null)
		{
			return ResponseEntity.status(HttpStatus.CREATED).body(antecedentes1);
		}
		else
		{
			return ResponseEntity.badRequest().build();
		}
		
	}
}
