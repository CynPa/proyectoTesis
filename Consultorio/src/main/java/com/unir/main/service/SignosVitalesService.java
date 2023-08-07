package com.unir.main.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.unir.main.model.SignosVitales;
import com.unir.main.model.SignosVitalesRequest;
import com.unir.main.repositorio.SignosVitalesRepositorio;

public class SignosVitalesService implements ISignosVitales {
	
	@Autowired
	SignosVitalesRepositorio repositorio;

	@Override
	public SignosVitales insertarSignosVitales(SignosVitalesRequest request) {
		if(request !=null 
		   && request.getFrecuenciaCardiaca()>=0 
		   && request.getFrecuenciaRespiratoria()>=0
		   && request.getPresionArterial()>=0
		   && request.getTemperatura() >=0
				)
		{
			SignosVitales signosVitales=SignosVitales.builder()
					.frecuenciaCardiaca(request.getFrecuenciaCardiaca())
					.frecuenciaRespiratoria(request.getFrecuenciaRespiratoria())
					.presionArterial(request.getPresionArterial())
					.temperatura(request.getTemperatura()).build();
			return repositorio.save(signosVitales);
		}
		else {
		return null;
		}
	}

}
