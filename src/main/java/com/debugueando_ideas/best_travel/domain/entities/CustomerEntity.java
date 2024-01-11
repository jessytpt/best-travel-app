package com.debugueando_ideas.best_travel.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity(name="customer")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class CustomerEntity implements Serializable {
    @Id
    @Column(name="dni")
    private String dni;
    @Column(name="full_name")
    private String fullName;
    @Column(name="credit_card")
    private String creditCard;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="total_flights")
    private Integer totalFlights;
    @Column(name="total_Lodgings")
    private Integer totalLodgings;
    @Column(name="total_tours")
    private Integer totalTours;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "customer"
    )

    private Set<TicketEntity> tickets;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "customer"
    )

    private Set<ReservationEntity> reservations;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "customer"
    )

    private Set<TourEntity> tours;



}
