package com.debugueando_ideas.best_travel;

import com.debugueando_ideas.best_travel.domain.repositories.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
@Slf4j
public class BestTravelApplication implements CommandLineRunner {

	private final FlyRepository flyRepository;
	private final HotelRepository hotelRepository;
	private final CustomerRepository customerRepository;
	private final ReservationRepository reservationRepository;
	//private final TicketRepository ticketRepository;

	public BestTravelApplication(
				FlyRepository flyRepository, HotelRepository hotelRepository,
				CustomerRepository customerRepository,ReservationRepository reservationRepository
			  //,TicketRepository ticketRepository
	) {

		this.flyRepository = flyRepository;
		this.hotelRepository = hotelRepository;
		this.customerRepository = customerRepository;
		this.reservationRepository = reservationRepository;
		//this.ticketRepository = ticketRepository;
	}

	/*




	private final TourRepository tourRepository;

	public BestTravelApplication(, FlyRepository flyRepository, , , , TourRepository tourRepository) {
		this.hotelRepository = hotelRepository;
		this.flyRepository = flyRepository;



		this.tourRepository = tourRepository;
	}

	 */

	public static void main(String[] args){
		SpringApplication.run(BestTravelApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception{
		var fly = flyRepository.findById(15L).get();
		var hotel = hotelRepository.findById(7L).get();
		//var ticket = ticketRepository.findById(UUID.fromString("42345678-1234-5678-5233-567812345678"));
		var reservation = reservationRepository.findById(UUID.fromString("12345678-1234-5678-1234-567812345678"));
		var customer= customerRepository.findById("WALA771012HCRGR054");
		log.info(String.valueOf(fly));
		log.info(String.valueOf(hotel));
		//log.info(String.valueOf(ticket));
		log.info(String.valueOf(reservation));
		log.info(String.valueOf(customer));
	}

}
