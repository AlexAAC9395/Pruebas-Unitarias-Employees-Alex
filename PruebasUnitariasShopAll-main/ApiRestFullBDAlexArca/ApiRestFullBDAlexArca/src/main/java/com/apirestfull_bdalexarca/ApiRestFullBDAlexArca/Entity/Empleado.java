package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "empleados")
public class Empleado {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre",nullable = false)
    private String nombre;

    @Column(name = "apellido",nullable = false)
    private String apellido;

    @Column(name = "email",nullable = false)
    private String email;

}
