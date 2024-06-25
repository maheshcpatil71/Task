package OOPS_Airline_Management_System;

public class Airline {
    // Attributes to store flights and passengers
    private Flight[] flights; // Array to store flights
    private Passenger[] passengers; // Array to store passengers
    private int flightCount; // Count of flights currently in the system
    private int passengerCount; // Count of passengers currently in the system

    // Constructor to initialize the airline system
    public Airline() {
        this.flights = new Flight[50]; // Assuming the system can handle up to 50 flights
        this.passengers = new Passenger[100]; // Assuming the system can handle up to 100 passengers
        this.flightCount = 0; // Initial count of flights is 0
        this.passengerCount = 0; // Initial count of passengers is 0
    }

    // Method to add a new flight to the system
    public void addFlight(Flight flight) {
        // Check if there is space to add more flights
        if (flightCount < flights.length) {
            flights[flightCount++] = flight; // Add the flight to the flights array and increment flightCount
        } else {
            System.out.println("Cannot add more flights."); // Print an error message if the array is full
        }
    }

    // Method to remove a flight from the system based on flight number
    public void removeFlight(String flightNumber) {
        // Loop through the flights array to find the flight to remove
        for (int i = 0; i < flightCount; i++) {
            // Check if the current flight in the array matches the flight number
            if (flights[i].getFlightNumber().equals(flightNumber)) {
                flights[i] = flights[--flightCount]; // Replace the flight to be removed with the last flight and decrement flightCount
                flights[flightCount] = null; // Set the last element to null to remove the duplicate reference
                break; // Exit the loop as the flight has been found and removed
            }
        }
    }

    // Method to register a new passenger in the system
    public void registerPassenger(Passenger passenger) {
        // Check if there is space to register more passengers
        if (passengerCount < passengers.length) {
            passengers[passengerCount++] = passenger; // Add the passenger to the passengers array and increment passengerCount
        } else {
            System.out.println("Cannot register more passengers."); // Print an error message if the array is full
        }
    }

    // Method to unregister a passenger from the system based on passport number
    public void unregisterPassenger(String passportNumber) {
        // Loop through the passengers array to find the passenger to remove
        for (int i = 0; i < passengerCount; i++) {
            // Check if the current passenger in the array matches the passport number
            if (passengers[i].getPassportNumber().equals(passportNumber)) {
                passengers[i] = passengers[--passengerCount]; // Replace the passenger to be removed with the last passenger and decrement passengerCount
                passengers[passengerCount] = null; // Set the last element to null to remove the duplicate reference
                break; // Exit the loop as the passenger has been found and removed
            }
        }
    }

    // Method to book a flight for a passenger based on passport number and flight number
    public void bookFlight(String passportNumber, String flightNumber) {
        Passenger passenger = null;
        Flight flight = null;

        // Find the passenger based on passport number
        for (int i = 0; i < passengerCount; i++) {
            if (passengers[i].getPassportNumber().equals(passportNumber)) {
                passenger = passengers[i]; // Set the passenger variable if found
                break;
            }
        }

        // Find the flight based on flight number
        for (int i = 0; i < flightCount; i++) {
            if (flights[i].getFlightNumber().equals(flightNumber)) {
                flight = flights[i]; // Set the flight variable if found
                break;
            }
        }

        // Book the flight if both the passenger and flight are found and the flight is available
        if (passenger != null && flight != null && flight.isAvailable()) {
            passenger.bookFlight(flight); // Call the bookFlight method of the Passenger class to book the flight
        } else {
            System.out.println("Booking failed. Check if the flight is available and passenger is registered."); // Print an error message if booking fails
        }
    }

    // Method to cancel a booked flight for a passenger based on passport number and flight number
    public void cancelBooking(String passportNumber, String flightNumber) {
        Passenger passenger = null;
        Flight flight = null;

        // Find the passenger based on passport number
        for (int i = 0; i < passengerCount; i++) {
            if (passengers[i].getPassportNumber().equals(passportNumber)) {
                passenger = passengers[i]; // Set the passenger variable if found
                break;
            }
        }

        // Find the flight based on flight number
        for (int i = 0; i < flightCount; i++) {
            if (flights[i].getFlightNumber().equals(flightNumber)) {
                flight = flights[i]; // Set the flight variable if found
                break;
            }
        }

        // Cancel the booking if both the passenger and flight are found
        if (passenger != null && flight != null) {
            passenger.cancelBooking(flight); // Call the cancelBooking method of the Passenger class to cancel the flight
        } else {
            System.out.println("Cancellation failed. Check if the flight is booked and passenger is registered."); // Print an error message if cancellation fails
        }
    }

    // Method to list all available flights in the system
    public void listAvailableFlights() {
        for (int i = 0; i < flightCount; i++) {
            if (flights[i].isAvailable()) { // Check if the flight is available
                System.out.println(flights[i]); // Print the flight details
            }
        }
    }

    // Method to list all booked flights in the system
    public void listBookedFlights() {
        for (int i = 0; i < flightCount; i++) {
            if (!flights[i].isAvailable()) { // Check if the flight is not available (i.e., booked)
                System.out.println(flights[i]); // Print the flight details
            }
        }
    }
}
