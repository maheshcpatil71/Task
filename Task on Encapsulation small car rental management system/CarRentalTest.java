package oops_encapsulation;

import java.time.LocalDate;

public class CarRentalTest {

	public static void main(String[] args) {
		// ( licensePlate, model, brand, year)
		Car car1 = new Car("ABC123", "Model S", "Tesla", 2020);
		System.out.println("Car License Plate Number :" + car1.getLicensePlate());
		System.out.println("Car model Number :" + car1.getModel());
		System.out.println("Car brand:" + car1.getBrand());
		System.out.println("Car year :" + car1.getYear());

		// customerId, name, email
		Customer customer1 = new Customer("C001", "Demo Name", "demo123@example.com");
		System.out.println("Customer Id : " + customer1.getCustomerId());
		System.out.println("Customer Name: " + customer1.getName());
		System.out.println("Customer Email: " + customer1.getEmail());

		System.out.println("Car available before rental: " + car1.isAvailable());// trur

		//                            Car car, Customer customer, rentalDate
		Rental rental1 = new Rental(car1, customer1, LocalDate.of(2023, 6, 1));
		System.out.println("Car available after rental: " + car1.isAvailable());// false

		rental1.returnCar(LocalDate.of(2023, 6, 10));
		System.out.println("Car available after return:::: " + car1.isAvailable()); // true

		// Test for invalid operations
		try {
			Rental rental2 = new Rental(car1, customer1, LocalDate.of(2023, 6, 1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Rental rental3 = new Rental(car1, customer1, LocalDate.of(2024, 6, 10));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
