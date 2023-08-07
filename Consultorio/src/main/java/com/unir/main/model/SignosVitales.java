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
import lombok.NoArgsConstructor;


@Table(name = "signosvitales")
@Builder
@Data
@Entity
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class SignosVitales {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	@Column(name = "presion_arterial")
	private Double presionArterial;
	@Column(name = "frecuencia_cardiaca")
	private Double frecuenciaCardiaca;
	@Column(name = "temperatura")
	private Double temperatura;
	@Column(name = "frecuencia_respiratoria")
	private Double frecuenciaRespiratoria;
}
