package com.unir.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Table(name = "antecedentes")
@Builder
@Data
@Entity
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Antecedentes {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	@Column(name = "alergia_antibioticos")
	@Enumerated(EnumType.STRING)
	private States alergiaAntibiotico;
	@Column(name = "alergia_anestecia")
	@Enumerated(EnumType.STRING)
	private States alergiaAnestecia;
	@Column(name = "hemorragias")
	@Enumerated(EnumType.STRING)
	private States hemorragias;
	@Column(name = "vih_sida")
	@Enumerated(EnumType.STRING)
	private States vihsida;
	@Column(name = "tuberculosis")
	@Enumerated(EnumType.STRING)
	private States tuberculosis;
	@Column(name = "asma")
	@Enumerated(EnumType.STRING)
	private States asma;
	@Column(name = "diabetes")
	@Enumerated(EnumType.STRING)
	private States diabetes;
	@Column(name = "hipertension")
	@Enumerated(EnumType.ORDINAL)
	private States hipertension;
	@Column(name = "enfermedad_cardiaca")
	@Enumerated(EnumType.STRING)
	private States enfCardiaca;
	@Column(name = "otros")
	@Enumerated(EnumType.STRING)
	private States otro;
	@Column(name = "comentarios")
	private String comentario;

}
