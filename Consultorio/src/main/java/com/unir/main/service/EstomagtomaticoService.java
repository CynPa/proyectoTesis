package com.unir.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unir.main.model.ExamenEstomagtomatico;
import com.unir.main.model.ExamenEstomagtomaticoRequest;
import com.unir.main.repositorio.RepositorioEstomagtomatico;
@Service
public class EstomagtomaticoService implements IEstomagtomatico {

	@Autowired 
	RepositorioEstomagtomatico repositorio;
	
	@Override
	public ExamenEstomagtomatico insertEstomagtomatico(ExamenEstomagtomaticoRequest request) {
		// TODO Auto-generated method stub
		if (request != null && 
				(request.getAtm().equals("X")||request.getAtm().equals(null) )&&
				(request.getCarrillos().equals("X")||request.getCarrillos().equals(null)) &&
			    (request.getGanglios().equals("X")||request.getGanglios().equals(null) )&&
			    (request.getGlandulasSalivales().equals("X")||request.getGlandulasSalivales().equals(null)) &&
			    (request.getLabios().equals("X")||request.getLabios().equals(null) )&&
			    (request.getLengua().equals("X")||request.getLengua().equals(null) )&&
			    (request.getMaxilarInferior().equals("X")||request.getMaxilarInferior().equals(null))&&
			    (request.getMejillas().equals("X")||request.getMejillas().equals(null))&&
			    (request.getOroFaringe().equals("X")||request.getOroFaringe().equals(null))&&
			    (request.getPaladar().equals("X")||request.getPaladar().equals(null))&&
			    (request.getPiso().equals("X")||request.getPiso().equals(null)))
			    {
			    	ExamenEstomagtomatico examen=ExamenEstomagtomatico.builder()
			    			.atm(request.getAtm())
			    			.carrillos(request.getCarrillos())
			    			.ganglios(request.getGanglios())
			    			.glandulasSalivales(request.getGlandulasSalivales())
			    		    .labios(request.getLabios())
			    		    .lengua(request.getLengua())
			    		    .maxilarInferior(request.getMaxilarInferior())
			    		    .mejillas(request.getMejillas())
			    		    .oroFaringe(request.getOroFaringe())
			    		    .paladar(request.getPaladar())
			    		    .piso(request.getPiso()).build();
			    	return repositorio.save(examen);
			    }
			
		return null;
	}

	@Override
	public List<ExamenEstomagtomatico> getEstomagtomaticos() {
		List<ExamenEstomagtomatico> lista=repositorio.findAll();	
		if (lista!=null)
		{
			return lista;
		}
		else
		{
			return null;
		}
		}
	

}
