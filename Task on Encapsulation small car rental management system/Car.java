package oops_encapsulation;

public class Car {
    // Private fields
    private String licensePlate;
    private String model;
    private String brand;
    private int year;
    private boolean available;

    // Constructor with validation
    public Car(String licensePlate, String model, String brand, int year)
    {
        if (licensePlate == null || licensePlate.isEmpty()) {
            throw new IllegalArgumentException("License plate cannot be null or empty");
        }
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be a positive number");
        }
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.available = true;
    }

    // Getter methods
    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    // Method to mark the car as rented
    public void rentCar() {
        this.available = false;
    }

    // Method to mark the car as returned
    public void returnCar() {
        this.available = true;
    }
}

