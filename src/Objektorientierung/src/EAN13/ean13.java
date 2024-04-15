package EAN13;

public class ean13 {
	
	public static void main(String[] args) {
		System.out.println(berechnePruefziffer());
	}
	
	public static int berechnePruefziffer() {
		//Deklaration
		int sum = 0;
		String ean = "401613810068";
//		String ean = "174268712649";
		char[] eanArray = ean.toCharArray();
		int pruefziffer;
		
		//Berechnung
		for (int i = 0; i < eanArray.length; i++) {	
			if (i % 2 == 0) {
				sum = sum + Character.getNumericValue(eanArray[i]) * 1;
			} else {
				sum = sum + Character.getNumericValue(eanArray[i]) * 3;
			}			
		}
		if (sum % 10 == 0) {
			pruefziffer = 0;
		} else {
			pruefziffer = sum % 10;
			pruefziffer = 10 - pruefziffer;
		}
		//Ausgabe
		return pruefziffer;
	}
}
