package com.example.backendProyectoIntegrador.repository;

import com.example.backendProyectoIntegrador.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}