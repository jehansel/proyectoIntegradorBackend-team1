package com.example.backendProyectoIntegrador.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "facturaciones")
public class Facturacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroFactura;
    private LocalDateTime fechaEmision;
    private Double total;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "facturacion")
    private List<Servicio> servicios;
}