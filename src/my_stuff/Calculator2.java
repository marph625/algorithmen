package Experiment1;
import Prog1Tools.IOTools;

// Klasse für einen Taschenrechner

public class Calculator2 {
	
	// 4 Grund-Rechenoperationen Beginn
	
	static int addition(int a, int b) {
		
		int result = a + b;
		return result;
		
	}
	
	static int subtraction(int a, int b) {
		
		int result = a - b;
		return result;
		
	}
	
	static int multiplication(int a, int b) {
		
		int result = a * b;
		return result;
		
	}
	
	static int division(int a, int b) {
		
		int result = a / b;
		return result;
		
	}
	
	// 4 Grund-Rechenoperationen Ende
	
	public static void main(String[] args) {
		
		/**
		 *  System.out.println("Hier sollte nun 5 stehen --> " + addition(1, 4));
			System.out.println("Hier sollte nun 5 stehen --> " + subtraction(9, 4));
			System.out.println("Hier sollte nun 5 stehen --> " + multiplication(1, 5));
			System.out.println("Hier sollte nun 5 stehen --> " + division(20, 4));
		 */
		
		int firstNumberInput = IOTools.readInt("Gib die erste Zahl ein: ");
		int secondNumberInput = IOTools.readInt("Gib die zweite Zahl ein: ");
		
		String operator = IOTools.readLine("Gib den gewünschten Operator ein (+, -, *, /): ");
		
		
		// Methode .equals wird bei if-Abfragen benutzt, um die Eingabe mit gegebener Zeichenkette zu vergleichen
		if (operator.equals("+")) {
			System.out.println("Das Ergebnis lautet: " + addition(firstNumberInput, secondNumberInput));
		} else if (operator.equals("-")) {
			System.out.println("Das Ergebnis lautet: " + subtraction(firstNumberInput, secondNumberInput));
		} else if (operator.equals("*")) {
			System.out.println("Das Ergebnis lautet: " + multiplication(firstNumberInput, secondNumberInput));
		} else if (operator.equals("/")) {
			System.out.println("Das Ergebnis lautet: " + division(firstNumberInput, secondNumberInput));
		} else {
			System.out.println("Das ist kein gültiger Operator!!!");
		}
	
	}
}
