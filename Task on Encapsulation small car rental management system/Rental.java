package oops_encapsulation;

import java.time.LocalDate;

public class Rental {
	// Private fields
	private Car car;
	private Customer customer;
	private LocalDate rentalDate;
	private LocalDate returnDate;

	// Constructor with validation
	public Rental(Car car, Customer customer, LocalDate rentalDate) {

		if (rentalDate.isAfter(LocalDate.now())) { // validates . If the date is in the future, it throws an
													// IllegalArgumentException.
			throw new IllegalArgumentException("Rental date cannot be in the future");
		}
		this.car = car;
		this.customer = customer;
		this.rentalDate = rentalDate;
		this.returnDate = null;

		car.rentCar(); // Sets reture car.available to false
		customer.addRentedCar(car);
		// It calls customer.addRentedCar(car) to add the car to the customer's rented
		// car list (likely in the Customer class).

	}

	// Getter methods
	public Car getCar() {
		return car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public LocalDate getRentalDate() {
		return rentalDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	// Method to return the car
	public void returnCar(LocalDate returnDate) {
		if (returnDate.isBefore(rentalDate)) {
			throw new IllegalArgumentException("Return date cannot be before rental date");
		}
		this.returnDate = returnDate;
		car.returnCar(); //return Sets car.available to true   or this.available = true;
		customer.removeRentedCar(car); //  rentedCars.remove(car);
	}
}
