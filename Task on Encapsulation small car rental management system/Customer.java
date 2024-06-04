package oops_encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	// Private fields
	private String customerId;
	private String name;
	private String email;
	private Car[] rentedCars; // Array of Cars
	private int rentedCarsCount; // Keeps track of rented cars
	// Topic of collection
	// private List<Car> rentedCars; //rentedCars` (List of Cars)

	// Constructor with validation
	public Customer(String customerId, String name, String email) {
		if (customerId == null || customerId.isEmpty()) {
			throw new IllegalArgumentException("Customer ID cannot be null or empty");
		}

		if (email == null || !email.contains("@")) {
			throw new IllegalArgumentException("Invalid email");
		}
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.rentedCars = new Car[10];// Initial capacity for rented cars (adjust as needed)
		this.rentedCarsCount = 0;// Array

		// this.rentedCars = new ArrayList<>(); // Topic of collection
	}

	// Getter methods
	public String getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	// Method to add a rented car to the list //Topic of array
	public void addRentedCar(Car car) {

		if (containsCar(car)) {// Checks car is already rented by calling containsCar.
			throw new IllegalStateException("Car is already rented by this customer");
		}	
		rentedCars[rentedCarsCount++] = car;// Adds the car to the rentedCars array and increments the rentedCarsCount.
	}

	// Method to remove a rented car from the list //Topic of array
	public void removeRentedCar(Car car) {
		int index = findCarIndex(car);// find index
		if (index == -1) {
			return; // Car not found
		}

		// Shift remaining elements to fill the gap //Topic of array
		for (int i = index; i < rentedCarsCount - 1; i++) {
			rentedCars[i] = rentedCars[i + 1];
		}
		rentedCarsCount--;
		
	}// Finds the index of the car using findCarIndex.
		// If the car is found, it shifts the remaining elements to fill the gap and
		// decrements rentedCarsCount.

	// Helper method To check if a car is already rented //Topic of array
	public boolean containsCar(Car car) {
		for (int i = 0; i < rentedCarsCount; i++) {
			if (rentedCars[i] == car) {
				return true;
			}
		}
		return false;
	}

	// Helper method to Find the index of a car in the rentedCars array 
	public int findCarIndex(Car car) {
		for (int i = 0; i < rentedCarsCount; i++) {
			if (rentedCars[i] == car) {
				return i;
			}
		}
		return -1; // Car not found
	}

	// Topic of collection
	// Method to add a rented car to the list
//	public void addRentedCar(Car car) {
//		if (rentedCars.contains(car)) // already contains the provided car object using the contains method.
//		{
//			throw new IllegalStateException("Car is already rented by this customer");
//		}
//		rentedCars.add(car);// car is not already rented, the method adds the car object
//	}
//
//	// Method to remove a rented car from the list
//	public void removeRentedCar(Car car) {
//		rentedCars.remove(car);
//	}
}
