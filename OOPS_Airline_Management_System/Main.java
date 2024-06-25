package OOPS_Airline_Management_System;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Instantiate flights and passengers
		Flight flight1 = new Flight("FL123", "Indian", "UK", "10:00", "13:00");
		Flight flight2 = new Flight("FL456", "UK", "Indian", "12:00", "15:00");

		Passenger passenger1 = new Passenger("John Doe", "P123456");
		Passenger passenger2 = new Passenger("Jane Smith", "P654321");

		// Instantiate airline
		Airline airline = new Airline();
		airline.addFlight(flight1);
		airline.addFlight(flight2);
		airline.registerPassenger(passenger1);
		airline.registerPassenger(passenger2);

		Scanner sc = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("Airline Management System:");
			System.out.println("1. Add Flight");
			System.out.println("2. Remove Flight");
			System.out.println("3. Register Passenger");
			System.out.println("4. Unregister Passenger");
			System.out.println("5. Book Flight");
			System.out.println("6. Cancel Booking");
			System.out.println("7. List Available Flights");
			System.out.println("8. List Booked Flights");
			System.out.println("9. Test StringUtil Methods");
			System.out.println("10. Test WrapperUtil Methods");
			System.out.println("11. Exit");
			System.out.print("Choose an option: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter flight number: ");
				String flightNumber = sc.nextLine();
				System.out.print("Enter origin: ");
				String origin = sc.nextLine();
				System.out.print("Enter destination: ");
				String destination = sc.nextLine();
				System.out.print("Enter departure time: ");
				String departureTime = sc.nextLine();
				System.out.print("Enter arrival time: ");
				String arrivalTime = sc.nextLine();
				Flight newFlight = new Flight(flightNumber, origin, destination, departureTime, arrivalTime);
				airline.addFlight(newFlight);
				break;
			case 2:
				System.out.print("Enter flight number to remove: ");
				flightNumber = sc.nextLine();
				airline.removeFlight(flightNumber);
				break;
			case 3:
				System.out.print("Enter passenger name: ");
				String name = sc.nextLine();
				System.out.print("Enter passport number: ");
				String passportNumber = sc.nextLine();
				Passenger newPassenger = new Passenger(name, passportNumber);
				airline.registerPassenger(newPassenger);
				break;
			case 4:
				System.out.print("Enter passport number to unregister: ");
				passportNumber = sc.nextLine();
				airline.unregisterPassenger(passportNumber);
				break;
			case 5:
				System.out.print("Enter passport number: ");
				passportNumber = sc.nextLine();
				System.out.print("Enter flight number: ");
				flightNumber = sc.nextLine();
				airline.bookFlight(passportNumber, flightNumber);
				break;
			case 6:
				System.out.print("Enter passport number: ");
				passportNumber = sc.nextLine();
				System.out.print("Enter flight number: ");
				flightNumber = sc.nextLine();
				airline.cancelBooking(passportNumber, flightNumber);
				break;
			case 7:
				System.out.println("Available Flights:");
				airline.listAvailableFlights();
				break;
			case 8:
				System.out.println("Booked Flights:");
				airline.listBookedFlights();
				break;
			case 9:
				// Test StringUtil Methods
				testStringUtilMethods(sc);
				break;
			case 10:
				// Test WrapperUtil Methods
				testWrapperUtilMethods(sc);
				break;
			case 11:
				running = false;
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		}

		sc.close();
	}

	private static void testStringUtilMethods(Scanner scanner) {
		System.out.println("Testing StringUtil Methods:");
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		System.out.print("Enter a character to count: ");
		char ch = scanner.next().charAt(0);
		scanner.nextLine(); // Consume newline

		int occurrences = StringUtil.countOccurrences(str, ch);
		System.out.println("Occurrences of '" + ch + "' in \"" + str + "\": " + occurrences);

		String reversed = StringUtil.reverseString(str);
		System.out.println("Reversed string: " + reversed);

		boolean isPalindrome = StringUtil.isPalindrome(str);
		System.out.println("Is the string a palindrome? " + isPalindrome);

		String capitalized = StringUtil.capitalizeWords(str);
		System.out.println("Capitalized words: " + capitalized);
	}

	private static void testWrapperUtilMethods(Scanner scanner) {
		System.out.println("Testing WrapperUtil Methods:");
		System.out.print("Enter integers separated by space: ");
		String[] intStrings = scanner.nextLine().split(" ");
		Integer[] integers = new Integer[intStrings.length];
		for (int i = 0; i < intStrings.length; i++) {
			integers[i] = Integer.parseInt(intStrings[i]);
		}

		int max = WrapperUtil.findMax(integers);
		System.out.println("Maximum value: " + max);

		System.out.print("Enter doubles separated by space: ");
		String[] doubleStrings = scanner.nextLine().split(" ");
		Double[] doubles = new Double[doubleStrings.length];
		for (int i = 0; i < doubleStrings.length; i++) {
			doubles[i] = Double.parseDouble(doubleStrings[i]);
		}

		double average = WrapperUtil.calculateAverage(doubles);
		System.out.println("Average value: " + average);

		System.out.print("Enter a binary string: ");
		String binaryString = scanner.nextLine();
		Boolean[] booleanArray = WrapperUtil.convertToBooleanArray(binaryString);
		System.out.print("Boolean array: ");
		for (Boolean b : booleanArray) {
			System.out.print(b + " ");
		}
		System.out.println();

		String convertedBinaryString = WrapperUtil.convertToBinaryString(booleanArray);
		System.out.println("Converted binary string: " + convertedBinaryString);
	}
}
