package Objektorientierung.src.myway_fitness;
import java.util.*;

public class MitarbeiterBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//Eingabe der Mitarbeiterdaten
		System.out.println("Gewicht in kg:");
		float gewicht = input.nextFloat();
		
		System.out.println("Größe in m:");
		float groesse = input.nextFloat();
		
		System.out.println("Name:");
		String name = input.next();
		
		input.close();
		
		FitData m1 = new FitData();
		
		m1.setGewicht(gewicht);
		m1.setGroesse(groesse);
		m1.setName(name);
		
		System.out.println("Hallo " + m1.getName() + "!");
		System.out.println("Dein Gewicht beträgt: " + gewicht + " kg");
		System.out.println("Deine Größe beträgt: " + groesse + " Meter");
		System.out.println("Dein BMI beträgt: " + m1.getBMI());
		
		m1.bmiAuswert();
		
	}

}
