package com.app.boot.rest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.boot.rest.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findByEmail(String email);
}
