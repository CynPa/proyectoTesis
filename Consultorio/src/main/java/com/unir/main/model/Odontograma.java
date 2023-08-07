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

@Table(name = "odontograma")
@Builder
@Data
@Entity
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Odontograma  {
@Id
@GeneratedValue(strategy =  GenerationType.AUTO)
private Long id;
@Column(name = "diente")
private String diente;
@Column(name = "motivo_consulta")
private String motivoConsulta;
@Column(name = "problema_actual")
private String problemaActual;

}
