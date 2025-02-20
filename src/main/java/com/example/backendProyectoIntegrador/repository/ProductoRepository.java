package com.example.backendProyectoIntegrador.repository;

import com.example.backendProyectoIntegrador.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
