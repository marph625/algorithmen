package Objektorientierung.src.oop_expertenaufgabe;

public class ArbeitsplatzPC {
	
	private String macAdresse;
	private char netz;
	private boolean status = true;
	private char z;
	
	// Parametrisierter Konstruktor
	public ArbeitsplatzPC(String macAdresse, char netz) {
		
		//Hat keinen Rückgabewert
		//Ist das ein Fehler?
		
		this.macAdresse = macAdresse;
		this.netz = netz;
	}
	
	// Set- und Get-Methoden
	public boolean setNetz(char netz) {
		this.netz = netz;
		
		if (checkNetz(netz) == true) {
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean setMAC(String macAdresse) {
		this.macAdresse = macAdresse;
		return true;
	}
	
	public char getNetz() {
		return netz;
	}
	
	public String getMAC() {
		if (checkMAC(macAdresse)) {
			return macAdresse;
		} else {
			String fehlermeldung = "Das kann keine gültige MAC-Adresse sein.";
			return fehlermeldung;
		}
	}
	
	private boolean checkNetz(char netz) {
		if (netz == 'A' || netz == 'B') {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean checkMAC(String macAdresse) {
		for (int i = 0; i < macAdresse.length(); i++) {
			checkHex(z);
		}
		return status;
	}
	
	private boolean checkHex(char z) {
		
		switch(z) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
			return true;
			default:
				return false;
		}
	}
}
