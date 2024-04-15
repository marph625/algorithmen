package Experiment1;
import java.util.Scanner;

public class Squarezip {
	static int quadrat(int n) {
		return n*n;
	}
	static void ausgabe(int n) {
		for (int i=1;i<=n;i++) {
			int result = quadrat(i);
			if (isPowerOfTwo(result)) {
				String s = "Quadrat("+i+") = "+quadrat(i);
				System.out.println(s);
			}
		}
	}
	static boolean isPowerOfTwo(int num) {
		return (num>0)&&((num&(num-1))==0);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gib eine Zahl ein:");
		String userInput = scanner.nextLine();
		if (userInput.matches("\\d+")) {
			int inputNumber = Integer.parseInt(userInput);
			ausgabe(inputNumber);
		} else {
			System.out.println("Das ist keine gültige Zahl!");
		} scanner.close();
	}
}
