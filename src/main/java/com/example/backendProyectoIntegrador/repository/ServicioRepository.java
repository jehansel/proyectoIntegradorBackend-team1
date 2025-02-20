package com.example.backendProyectoIntegrador.repository;

import com.example.backendProyectoIntegrador.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {
}
