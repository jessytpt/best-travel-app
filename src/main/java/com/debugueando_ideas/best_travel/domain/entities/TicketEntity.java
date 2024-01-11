package com.debugueando_ideas.best_travel.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name="ticket")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class TicketEntity implements Serializable {
    @Id
    @Column(name="id")
    private UUID id;
    @Column(name="departure_date")
    private LocalDate departeruDate;
    @Column(name="arrival_date")
    private LocalDate arrivalDate;
    @Column(name="purchase_date")
    private  LocalDate purchaseDate;
    @Column(name="price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "fly_id")
    private FlyEntity fly;

    @ManyToOne
    @JoinColumn(name="tour_id",nullable = true)
    private TourEntity tour;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private CustomerEntity customer;
}
