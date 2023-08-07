package com.unir.main.model;

import lombok.Data;
@Data
public class SignosVitalesRequest {
	private Double presionArterial;
	private Double frecuenciaCardiaca;
	private Double temperatura;
	private Double frecuenciaRespiratoria;

}
