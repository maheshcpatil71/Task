package OOPS_Airline_Management_System;

public class WrapperUtil {
	// Method to find the maximum value in an array of integers
	public static Integer findMax(Integer[] numbers) {
		int max = numbers[0]; // Initialize max with the first element of the array
		for (int number : numbers) {
			if (number > max) {
				max = number; // Update max if the current number is greater
			}
		}
		return max; // Return the maximum value
	}

	// Method to calculate the average of an array of doubles
	public static Double calculateAverage(Double[] numbers) {
		double sum = 0; // Initialize the sum
		for (double number : numbers) {
			sum += number; // Add each number to the sum
		}
		return sum / numbers.length; // Return the average by dividing the sum by the array length
	}

	// Method to convert a binary string to a Boolean array
	public static Boolean[] convertToBooleanArray(String binaryString) {
		Boolean[] booleanArray = new Boolean[binaryString.length()]; // Create a Boolean array of the same length as the
																		// binary string
		for (int i = 0; i < binaryString.length(); i++) {
			booleanArray[i] = binaryString.charAt(i) == '1'; // Convert '1' characters to true and '0' characters to
																// false
		}
		return booleanArray; // Return the Boolean array
	}

	// Method to convert a Boolean array to a binary string
	public static String convertToBinaryString(Boolean[] booleanArray) {
		StringBuilder binaryString = new StringBuilder(); // Create a StringBuilder to build the binary string
		for (Boolean bool : booleanArray) {
			binaryString.append(bool ? '1' : '0'); // Append '1' if true, '0' if false
		}
		return binaryString.toString(); // Return the binary string
	}
}
