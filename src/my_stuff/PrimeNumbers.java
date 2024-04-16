package my_stuff;
import Prog1Tools.IOTools;

public class PrimeNumbers {

	public static void main(String[] args) {

		System.out.println("Alle Primzahlen zwischen 2 und einer eingegebenen Zahl sollen berechnet werden.");
		int num = IOTools.readInt("Gib eine Zahl ein\n >> ");
		boolean flag = false;

		if (num == 1) {
			System.out.println(num + " is not a prime number");
		} else if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println(num + " is not a prime number");
			} else
				System.out.println(num + " is a prime number!!!");
		}
	}
}
