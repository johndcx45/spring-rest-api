package com.app.boot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.boot.rest.modelo.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long	>{
	Curso findByNome(String nome);
}
