package com.projetos.projeto_curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.projeto_curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
