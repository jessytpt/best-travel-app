package com.debugueando_ideas.best_travel.domain.entities;

import com.debugueando_ideas.best_travel.util.AeroLinea;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.action.internal.OrphanRemovalAction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity(name="fly")
@NoArgsConstructor  // crea un constructor vacío
@AllArgsConstructor //crea un cosntructor con todos los atributos
@Data //crea los setters y getters de los atributos de la clase
@Builder

public class FlyEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private  long id;

    @Column(name="origin_lat")
    private Double originLat;

    @Column(name="origin_lng")
    private Double originLng;

    @Column(name="destiny_lat")
    private Double destinyLat;

    @Column(name="destiny_lng")
    private Double destinyLng;

    @Column(name="origin_name")
    private String originName;

    @Column(name="destiny_name")
    private String destinyName;

    @Column(name="price")
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(name="aero_line")
    private AeroLinea aeroline;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "fly"
    )

    private Set<TicketEntity> tickets;
}
