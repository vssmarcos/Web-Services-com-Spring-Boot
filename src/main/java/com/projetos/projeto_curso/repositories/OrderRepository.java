package com.projetos.projeto_curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.projeto_curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
