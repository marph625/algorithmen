package Experiment1;

import java.util.Scanner;

// Initialize Class
public class Square {
	
	// Function is defined, takes int as parameter and returns int 
	static int quadrat( int n ) {

		// Int n is multiplied to int n
		return n * n;
		
	}

	// Function is defined, takes int n as parameter and returns output
	static void ausgabe( int n, int power ) {
		
		// for-loop, takes int n as parameter
		// i is assigned a value 1, repeats as long as i <= int n  
		// every loop i is incremented by 1 
		for (int i = 1; i <= n; i = i + 1 ) {
			
			int result = quadrat(i);
			
			// Check if result is power of power :S
			if (isPowerOfTwo(result, power)) {
				
				// Variable s is defined as String
				// Example expected output: "Quadrat (5) = 25
				String s = "Zwei hoch(" + i + ") = " + quadrat( i );
				
				// Variable s is printed to the console
				System.out.println( s );
			}		
		}
	}
	
	// function to return a boolean if int num is a power of two
	static boolean isPowerOfTwo(int num, int power) {
		return (num>0)&&((num&(num-1))==0);
	}
	
	// main function serves as entry point of the program and takes 
	// 1. an array of strings and 2. the argument args in a parameter list
	public static void main( String[] args ) {
		
		// Create a scanner object to read user input
		Scanner scanner = new Scanner(System.in);
		
		// \n might not be working
		System.out.println("Gib eine Zahl ein:");
		
		// Read user input as a string
		String userInput = scanner.nextLine();
		
		// Check if userInput is numeric and then parse it as an integer
		if (userInput.matches("\\d+")) {
			int inputNumber = Integer.parseInt(userInput);
			
			// Output Power of 4
						System.out.println("Potenzen von 4:");
						ausgabe(inputNumber, 4);
						
						// Output Power of 8
						System.out.println("Potenzen von 8:");
						ausgabe(inputNumber, 8);
			
		} else {
			System.out.println("Das war keine gültige Zahl!");
		}
		
		// Close the scanner
		scanner.close();
		
	}
	
	
}
 