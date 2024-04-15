package Experiment1;
import Prog1Tools.IOTools;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		
		System.out.println("Alle Primzahlen zwischen 2 und einer eingegebenen Zahl sollen berechnet werden.");
		int primes = IOTools.readInt("Gib eine Zahl ein\n >> ");
		
		for (int i = 2; i < primes; i++) {
			if (i % i != 0 && i % 1 != 0) {
				System.out.println("Keine Primzahl");
			} else {
				System.out.println(i);
			}
		}
	}
}
