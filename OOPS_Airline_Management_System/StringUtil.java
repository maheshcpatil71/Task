package OOPS_Airline_Management_System;

public class StringUtil {

	// Method to count the occurrences of a character in a string
	public static int countOccurrences(String str, char ch) {
		int count = 0; // Initialize a counter to 0
		for (char c : str.toCharArray()) { // Convert the string to a character array and iterate through it
			if (c == ch) { // Check if the current character matches the given character
				count++; // Increment the counter if there's a match
			}
		}
		return count; // Return the total count
	}

	// Method to reverse a given string
	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString(); // Use StringBuilder to reverse the string and convert it
															// back to String
	}

	// Method to check if a string is a palindrome
	public static boolean isPalindrome(String str) {
		String reversed = reverseString(str); // Reverse the string using the reverseString method
		return str.equals(reversed); // Check if the original string is equal to its reversed version
	}

	// Method to capitalize the first letter of each word in a string
	public static String capitalizeWords(String str) {
		String[] words = str.split("\\s"); // Split the string into words based on spaces
		StringBuilder capitalized = new StringBuilder(); // Initialize a StringBuilder to construct the capitalized
															// string
		for (String word : words) { // Iterate through each word
			// Capitalize the first letter and append the rest of the word, then add a space
			capitalized.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
		}
		return capitalized.toString().trim(); // Convert the StringBuilder to a string and remove trailing spaces
	}
}
