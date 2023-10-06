package com.electiva2.grupo3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "estado", nullable = false)
    private Boolean estado;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @ManyToMany(mappedBy = "roles")
    private Set<Usuario> usuarios;
    @OneToMany(mappedBy = "usuarioRol.rol")
    private List<Solicitud> solicitudes;
}
