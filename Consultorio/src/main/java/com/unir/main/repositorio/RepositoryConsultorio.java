package com.unir.main.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unir.main.model.Odontograma;

public interface RepositoryConsultorio extends JpaRepository<Odontograma, Long> {

	
}
