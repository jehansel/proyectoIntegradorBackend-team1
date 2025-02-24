package com.petcare.backend.proyectoIntegrador.repository;

import com.petcare.backend.proyectoIntegrador.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IServicioRepository extends JpaRepository<Servicio, Short> {
    @Query("SELECT s FROM Servicio s WHERE s.nombre LIKE %:nombre%")
    List<Servicio> findByNombre(String nombre);
    
    List<Servicio> findByDisponibilidad(String disponibilidad);
    
    @Query("SELECT s FROM Servicio s WHERE s.precio <= :precioMaximo")
    List<Servicio> findByPrecioLessThanEqual(BigDecimal precioMaximo);

    @Query("SELECT s FROM Servicio s WHERE s.idServicio = :establecimientoId")
    List<Servicio> findByEstablecimientoId(Long establecimientoId);
    
    @Query("SELECT s FROM Servicio s WHERE s.esBorrado = false")
    List<Servicio> findActivos();
} 