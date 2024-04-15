package Objektorientierung.src.oop_expertenaufgabe;

public class Arbeitsplatzverwaltung {

	public static void main(String[] args) {

		//TODO
		//checkHex(), checkNetz() und checkMAC() zum laufen bringen
		//Objekt erstellen, ohne Parameterübergabe (Fehlermeldung, keine Ahnung warum?)
		ArbeitsplatzPC a1 = new ArbeitsplatzPC("08:A5:F3:43:GE:B4", 'A');
		ArbeitsplatzPC a2 = new ArbeitsplatzPC("36:E5:D7:26:EF:B5", 'B');
		
		a1.setMAC("47:D5:F0:E3:CE:B2");
		a1.setNetz('B');
		
		//Test-Fälle mit Fehlern
		a2.setMAC("08:A5:F3:43:GE:B11");
		a2.setNetz('C');
		
		System.out.println("Arbeitsplatz 1");
		System.out.println("MAC-Adresse: " + a1.getMAC());
		System.out.println("Netzklasse: " + a1.getNetz());
		System.out.println();
		System.out.println("Arbeitsplatz 2");
		System.out.println("MAC-Adresse: " + a2.getMAC());
		System.out.println("Netzklasse: " + a2.getNetz());	
		
	}

}
