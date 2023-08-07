package com.unir.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.unir.main.model.Antecedentes;
import com.unir.main.model.AntecedentesRequest;
import com.unir.main.model.States;
import com.unir.main.repositorio.RepositorioAntecedentes;
@Service
public class AntecedentesService implements IAntecedentesServicios {

	@Autowired
	RepositorioAntecedentes repositorio;
	
	@Override
	public Antecedentes insertarAntecedentes(AntecedentesRequest request) {
		System.out.println(request);
		if (request != null 
				&&(request.getAlergiaAnestecia().equals(States.SI)||request.getAlergiaAnestecia().equals(States.NO))
				&&(request.getAlergiaAntibiotico().equals(States.SI)||request.getAlergiaAntibiotico().equals(States.NO))
				&&(request.getAsma().equals(States.SI)||request.getAsma().equals(States.NO))
				&&(request.getDiabetes().equals(States.SI)||(request.getDiabetes().equals(States.NO)))
				&&(request.getEnfCardiaca().equals(States.SI)||(request.getEnfCardiaca().equals(States.NO))	)
				&&(request.getHemorragias().equals(States.SI) || request.getHemorragias().equals(States.NO))
				&&(request.getHipertension().equals(States.SI)||request.getHipertension().equals(States.NO))
				&&(request.getOtro().equals(States.SI)||request.getOtro().equals(States.NO))
				&&(request.getTuberculosis().equals(States.SI)||request.getTuberculosis().equals(States.NO))
				&&(request.getVihsida().equals(States.SI)||request.getVihsida().equals(States.NO))
				)
				{
			     Antecedentes antecedentes =Antecedentes.builder()
			    		 .alergiaAnestecia(request.getAlergiaAnestecia())
			    		 .alergiaAntibiotico(request.getAlergiaAntibiotico())
			    		 .asma(request.getAsma())
			    		 .diabetes(request.getDiabetes())
			    		 .enfCardiaca(request.getEnfCardiaca())
			    		 .hemorragias(request.getHemorragias())
			    		 .hipertension(request.getHipertension())
			    		 .otro(request.getOtro())
			    		 .tuberculosis(request.getTuberculosis())
			    		 .vihsida(request.getVihsida())
			    		 .comentario(request.getComentario())
			    		 .build();
					return repositorio.save(antecedentes);
				}
				else {
					System.out.println("se fue por null");
		return null;}
	}

}
