package com.unir.main.service;

import com.unir.main.model.SignosVitales;
import com.unir.main.model.SignosVitalesRequest;

public interface ISignosVitales {

	public SignosVitales insertarSignosVitales(SignosVitalesRequest request);
}
