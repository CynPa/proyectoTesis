package com.unir.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.unir.main.model.Odontograma;
import com.unir.main.model.OdontogramaRequest;
import com.unir.main.repositorio.RepositoryConsultorio;
@Service
public class ConsultorioService implements IConsultorioService{

	@Autowired
	RepositoryConsultorio consultorio;

	@Override
	public Odontograma insertarOdontograma(OdontogramaRequest request) {
		if(request !=null && StringUtils.hasLength(request.diente.trim()))
		{
			//Odontograma odon=new Odontograma();
		    Odontograma odon=Odontograma.builder().diente(request.getDiente()).build();
		   return  consultorio.save(odon);
		}
		else {
			return null;
		}
		
	}
	
	
}
