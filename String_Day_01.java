package com.string;

import java.util.Scanner;

public class String_Day_01 {

	public static void main(String[] args) {

		// Create Scanner object to read user input
		Scanner scanner = new Scanner(System.in);

		// Read the user's full name
		String name = scanner.nextLine();

		// Display the entered name
		System.out.println("Your Name: " + name);

		// Concatenate two strings and find the length of the full name
		// Example: "Sagar" + "Thitame" -> 12

		String firstName = "Sagar"; // Store the last name
		String lastName = "Thitame";

		String fullName = firstName + lastName; // Combine first name and last name

		System.out.println(fullName.length()); // Print the total number of characters in the full name

		// Print each character of a String separately
		// Example: "SagarThitame" -> S, a, g, a, r, T, h, i, t, a, m, e

		for (int i = 0; i < fullName.length(); i++) {

			// Get and print the character at the current index
			System.out.println(fullName.charAt(i));
		}

		// Compare two Strings using compareTo() method
		// Example: "Virat".compareTo("Virat") -> 0

		String name1 = "Virat";
		String name2 = "Virat";

		// Check whether both Strings have the same content
		if (name1.compareTo(name2) == 0) {
			System.out.println("Strings are Equal");
		} else {
			System.out.println("Strings are Not Equal");
		}

		// Compare two String references using == operator
		// The == operator checks whether both references point to the same object
		if (name1 == name2) {
			System.out.println("String references are Equal");
		} else {
			System.out.println("String references are Not Equal");
		}
	}
}
