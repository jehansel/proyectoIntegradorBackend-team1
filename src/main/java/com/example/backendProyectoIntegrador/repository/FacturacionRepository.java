package com.example.backendProyectoIntegrador.repository;

import com.example.backendProyectoIntegrador.entity.Facturacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturacionRepository extends JpaRepository<Facturacion, Long> {
}
