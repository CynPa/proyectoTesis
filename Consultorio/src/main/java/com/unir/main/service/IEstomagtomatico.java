package com.unir.main.service;

import java.util.List;

import com.unir.main.model.ExamenEstomagtomatico;
import com.unir.main.model.ExamenEstomagtomaticoRequest;

public interface IEstomagtomatico {

    public List<ExamenEstomagtomatico> getEstomagtomaticos();
	
	public  ExamenEstomagtomatico insertEstomagtomatico( ExamenEstomagtomaticoRequest  request);
}
