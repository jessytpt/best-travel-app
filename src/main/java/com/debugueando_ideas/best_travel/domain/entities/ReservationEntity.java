package com.debugueando_ideas.best_travel.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name="reservation")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class ReservationEntity implements Serializable {
    @Id
    private UUID id;
    @Column(name="date_reservation")
    private LocalDateTime dateTimeReservation;
    @Column(name="date_start")
    private LocalDate dateStart;
    @Column(name="date_end")
    private LocalDate dateEnd;
    @Column(name="total_days")
    private Integer totalDays;
    @Column(name="price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name="hotel_id")
    private HotelEntity hotel;

    @ManyToOne
    @JoinColumn(name="tour_id",nullable = true)
    private TourEntity tour;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private CustomerEntity customer;

}
