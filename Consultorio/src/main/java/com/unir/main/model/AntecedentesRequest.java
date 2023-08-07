package com.unir.main.model;


import lombok.Data;
@Data
public class AntecedentesRequest {
	
	public AntecedentesRequest(States alergiaAntibiotico,States alergiaAnestecia,
			States  hemorragias,States vihsida,States tuberculosis,States asma,
			States diabetes,States hipertension,States enfCardiaca, States otro,
			String comentario) {
		this.alergiaAntibiotico=alergiaAntibiotico;
		this.alergiaAnestecia=alergiaAnestecia;
		this.hemorragias=hemorragias;
		this.vihsida=vihsida;
		this.tuberculosis=tuberculosis;
		this.asma=asma;
		this.diabetes=diabetes;
		this.hipertension=hipertension;
		this.enfCardiaca=enfCardiaca;
		this.otro=otro;
		this.comentario=comentario;
	}
	private States alergiaAntibiotico;
	private States alergiaAnestecia;
	private States hemorragias;
	private States vihsida;
	private States tuberculosis;
	private States asma;
	private States diabetes;
	private States hipertension;
	private States enfCardiaca;
	private States otro;
	private String comentario;
}







