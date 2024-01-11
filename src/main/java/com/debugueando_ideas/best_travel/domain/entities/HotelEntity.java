package com.debugueando_ideas.best_travel.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Set;

@Entity(name="hotel")
@NoArgsConstructor  // crea un constructor vacío
@AllArgsConstructor //crea un cosntructor con todos los atributos
@Data //crea los setters y getters de los atributos de la clase
@Builder
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name",length=50)
    private String name;
    @Column(name="address",length=50)
    private String address;
    @Column(name="rating")
    private Integer rating;
    @Column(name="price")
    private BigDecimal price;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "hotel"
    )

    private Set<ReservationEntity> reservation;


        }
