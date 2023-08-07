package com.unir.main.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unir.main.model.ExamenEstomagtomatico;
import com.unir.main.model.ExamenEstomagtomaticoRequest;
import com.unir.main.service.EstomagtomaticoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class EstomagtomaticoController {
	@Autowired
	EstomagtomaticoService servicio;
	
	@PostMapping("/consultorio/estomagtomatico")
	public ResponseEntity<ExamenEstomagtomatico> estomagtomatico(@RequestBody ExamenEstomagtomaticoRequest request)
	{
		ExamenEstomagtomatico examen = servicio.insertEstomagtomatico(request);
		if(examen !=null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(examen);
		}else
		{
			return ResponseEntity.badRequest().build();
		}
		
	}
	
	@GetMapping("/consultorio/getlistaestimag")
	public ResponseEntity<List<ExamenEstomagtomatico>> getEstimagtomatico()
	{
		List<ExamenEstomagtomatico> lista=servicio.getEstomagtomaticos();
		if(lista!=null)
    	{
    		return ResponseEntity.ok(lista);
    	}
    	else {
    		return ResponseEntity.ok(Collections.emptyList());
    	}
	}
}
