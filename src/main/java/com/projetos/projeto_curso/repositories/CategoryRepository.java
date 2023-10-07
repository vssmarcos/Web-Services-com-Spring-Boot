package com.projetos.projeto_curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.projeto_curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
