package com.unir.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.unir.main.model.Odontograma;
import com.unir.main.model.OdontogramaRequest;
import com.unir.main.model.SignosVitales;
import com.unir.main.model.SignosVitalesRequest;
import com.unir.main.service.ConsultorioService;
import com.unir.main.service.SignosVitalesService;

public class SignosVitalesController {
	@Autowired
	 SignosVitalesService servicio;
	
	@PostMapping(path = "/consultario/SignosVitales")
    public ResponseEntity<SignosVitales> insertar(@RequestBody SignosVitalesRequest request) {
	    SignosVitales signosVitales=servicio.insertarSignosVitales(request);
		
		if( signosVitales !=null)
		{
			return ResponseEntity.status(HttpStatus.CREATED).body(signosVitales);
		}
		else
		{
			return ResponseEntity.badRequest().build();
		}
		
	}
}
