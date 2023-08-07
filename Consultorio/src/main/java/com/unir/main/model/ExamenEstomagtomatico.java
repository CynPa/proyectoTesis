package com.unir.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "antecedentes")
@Builder
@Data
@Entity
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ExamenEstomagtomatico {
	
	

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	@Column(name = "labios")
	private String labios;
	@Column(name = "mejillas")
	private String mejillas;
	@Column(name = "maxilar_inferior")
	private String maxilarInferior;
	@Column(name = "lengua")
	private String lengua;
	@Column(name = "paladar")
	private String paladar;
	@Column(name = "piso")
	private String piso;
	@Column(name = "carrillos")
	private String carrillos;
	@Column(name = "glandulas_salivales")
	private String glandulasSalivales;
	@Column(name = "oro_faringe")
	private String oroFaringe;
	@Column(name = "atm")
	private String atm;
	@Column(name = "ganglios")
	private String ganglios;
}
