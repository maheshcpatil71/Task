package oops_encapsulation;

import java.time.LocalDate;

public class CarRentalTest {
    public static void main(String[] args) {
        // Create a Car object
        Car car1 = new Car("ABC123", "Model S", "Tesla", 2020);
        System.out.println("Car License Plate Number: " + car1.getLicensePlate());
        System.out.println("Car Model: " + car1.getModel());
        System.out.println("Car Brand: " + car1.getBrand());
        System.out.println("Car Year: " + car1.getYear());

        // Create a Customer object
        Customer customer1 = new Customer("C001", "Demo Name", "demo123@example.com");
        System.out.println("Customer Id: " + customer1.getCustomerId());
        System.out.println("Customer Name: " + customer1.getName());
        System.out.println("Customer Email: " + customer1.getEmail());

        // Check car availability before rental
        System.out.println("Car available before rental: " + car1.isAvailable()); // true

        // Rent the car
        LocalDate rentalDate = LocalDate.of(2024, 6, 1);
        Rental rental1 = new Rental(car1, customer1, rentalDate);
        System.out.println("Car available after rental: " + car1.isAvailable()); // false
        System.out.println("Car rental date: " + rental1.getRentalDate()); // 2023-06-01

        // Return the car
        LocalDate returnDate = LocalDate.of(2024, 6, 10);
        rental1.returnCar(returnDate);
        System.out.println("Car available after return: " + car1.isAvailable()); // true
        System.out.println("Car return date: " + rental1.getReturnDate()); // 2023-06-10

        // Test for invalid operations
        try {
            Rental rental2 = new Rental(car1, customer1, LocalDate.of(2026, 6, 1));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Rental rental3 = new Rental(car1, customer1, LocalDate.of(2025, 6, 10));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
