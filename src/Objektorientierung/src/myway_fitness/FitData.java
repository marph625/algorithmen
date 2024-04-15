package Objektorientierung.src.myway_fitness;

public class FitData {
	
	private float gewicht;
	private float groesse;
	private String name;
	private float bmi = gewicht / groesse;
	
	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	}
	
	public void setGroesse(float groesse) {
		this.groesse = groesse;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getBMI() {
		this.bmi = gewicht / (groesse * groesse);
		return this.bmi;
	}
	
	public void bmiAuswert() {
		float bmi = getBMI();
		
		if (bmi > 25) {
			System.out.println("Au Backe! Du solltest etwas gegen deine krankhafte Fettleibigkeit tun.\nOder auch nicht, mir egal.");
		} else if (bmi < 19) {
			System.out.println("Iss' mal was du Lauch!\nDich kann man hinter einem Zweig verstecken.\nIss mehr oder lass' es bleiben, mir egal.");
		} else {
			System.out.println("Dein BMI ist ok.\nVermutlich lebst du dennoch sehr ungesund und solltest dagegen etwas unternehmen.");
		}
	}
	
}
