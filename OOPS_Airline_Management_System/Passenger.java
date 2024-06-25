package OOPS_Airline_Management_System;

public class Passenger {
	private String name; // Passenger's name
	private String passportNumber; // Passenger's passport number
	private Flight[] bookedFlights; // Array to store booked flights
	private int bookedFlightCount; // Count of booked flights

	// Constructor to initialize the passenger's details
	public Passenger(String name, String passportNumber) {
		this.name = name;
		this.passportNumber = passportNumber;
		this.bookedFlights = new Flight[10]; // Assuming a passenger can book up to 10 flights
		this.bookedFlightCount = 0; // Initial count of booked flights is 0
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Flight[] getBookedFlights() {
		return bookedFlights;
	}

	public void setBookedFlights(Flight[] bookedFlights) {
		this.bookedFlights = bookedFlights;
	}

	public int getBookedFlightCount() {
		return bookedFlightCount;
	}

	public void setBookedFlightCount(int bookedFlightCount) {
		this.bookedFlightCount = bookedFlightCount;
	}

	// toString method to provide a string representation of the Passenger object
	@Override
	public String toString() {
		return "Passenger{" + "name='" + name + '\'' + ", passportNumber='" + passportNumber + '\''
				+ ", bookedFlightCount=" + bookedFlightCount + '}';
	}

	// Method to book a flight for the passenger
	public void bookFlight(Flight flight) {
		// Check if there is space to book more flights
		if (bookedFlightCount < bookedFlights.length) {
			bookedFlights[bookedFlightCount++] = flight; // Add the flight to the bookedFlights array and increment
															// bookedFlightCount
			flight.bookFlight(); // Call the bookFlight method of the Flight class to mark the flight as
									// booked,okk
		} else {
			System.out.println("Cannot book more flights."); // Print an error message if the passenger has already
																// booked the maximum number of flights
		}
	}

	// Method to cancel a booked flight for the passenger
	public void cancelBooking(Flight flight) {
		// Loop through the bookedFlights array to find the flight to cancel
		for (int i = 0; i < bookedFlightCount; i++) { // Check if the current flight in the array matches the flight to be canceled
			
			if (bookedFlights[i].getFlightNumber().equals(flight.getFlightNumber())) {
				// Call the cancelBooking method of the Flight class to mark the flight as available
				
				bookedFlights[i].cancelBooking();
				// Replace the canceled flight with the last booked flight in the array
				// Decrement bookedFlightCount to reflect one less booked flight
				bookedFlights[i] = bookedFlights[--bookedFlightCount];

				// Set the last element to null to remove the duplicate reference
				bookedFlights[bookedFlightCount] = null;
				break;
			}
		}
	}

}
