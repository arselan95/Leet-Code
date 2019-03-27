package bookMovieTicket;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/*
 * The Main Classes to be used for the user personas :

User
Movie
Theater
Booking
Address
Facilities
 */
public class MovieBookingSystem {
	// Java skeleton code to design an online movie
	// booking system.
	// Enums :

	public enum SeatStatus {
		SEAT_BOOKED, SEAT_NOT_BOOKED;
	}

	public enum MovieStatus {
		Movie_Available, Movie_NotAvailable;
	}

	public enum MovieType {
		ENGLISH, HINDI;
	}

	public enum SeatType {
		NORMAL, EXECUTIVE, PREMIUM, VIP;
	}

	public enum PaymentStatus {
		PAID, UNPAID;
	}

	// We have users class in which users details are kept.
	class User {

		int userId;
		String name;
		Date dateOfBirth;
		String mobNo;
		String emailId;
		String sex;
	}

	//
	class Movie {

		int movieId;
		int theaterId;
		MovieType movieType;
		MovieStatus movieStatus;
	}

	// Theater class in which name of the theater, it’s address and list of movies
	// currently running are kept.
	class Theater {

		int theaterId;
		String theaterName;
		List<Movie> movies;
		float rating;
	}

	// Booking class lets you book the seat in a particular theater. It keeps a
	// reference in Movie, Payment class.
	class Booking {
		int bookingId;
		int userId;
		int movieId;
		List<SeatStatus> bookedSeats;
		int amount;
		PaymentStatus status_of_payment;
		Date booked_date;
		Time movie_timing;
	}

	// maybe
	class Address {

		String city;
		String pinCode;
		String state;
		String streetNo;
		String landmark;
	}

	class Transaction {
	}

	// How to handle the cases where two persons are trying to access the same seat
	// almost same time?

	class SeatBook {
		Transaction transaction_obj;
		int totsl_Seats = 100;
		// boolean seats[total_seats];
		String place;
		String ticketType;

		boolean check_availability() {
			return false;
		};

		int position_of_seat() {
			// return seat_pos_in_theator;
			return 0;
		}

		void multiple_tickets() {
		};

		void final_booking() {
			/*
			 * place = position_of_seat(); if (single_ticket) continue; else
			 * mutliple_ticket_booking();
			 * 
			 * Transaction_obj.pay(ticketType, seats_booked, place);
			 */
		}
	}

}
