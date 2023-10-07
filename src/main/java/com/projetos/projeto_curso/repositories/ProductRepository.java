package com.projetos.projeto_curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.projeto_curso.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
