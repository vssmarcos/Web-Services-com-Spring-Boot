package com.projetos.projeto_curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.projeto_curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
