package com.example.backendProyectoIntegrador.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Facturacion> facturas;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Servicio> servicios;
}