package fldksjadfjs;

public class Excel {

	public static void main(String[] args) {

		int alter = 40;
		int umsatz = 149999;
		String prozent1 = "5%";
		String prozent2 = "10%";
		String prozent3 = "15%";
		
		// WENN-Funktion
		/*if(alter < 41) {
			if(umsatz < 100000) {
				System.out.println(prozent1);
			}else if (umsatz < 150000) {
				System.out.println(prozent2);
			}else {
				System.out.println(prozent3);
			}
		} else {
			System.out.println(0);
		}
		
		// WENN-UND Funktion
		if(alter <= 40 && umsatz < 100000) {
			System.out.println(prozent1);
		} else if(alter <= 40 && umsatz < 150000) {
			System.out.println(prozent2);
		} else if(alter <= 40 && umsatz >= 150000){
			System.out.println(prozent3);
		} else {
			System.out.println(0);
		}
		
		String standort1 = "Deutschland";
		String standort2 = "England";
		String name = "Pirelli";
		
		if(name.equals("Pirelli") && standort1.equals("Deutschland") || standort2.equals("England")) {
			System.out.println("Ja");
		} else {
			System.out.println("Nein");
		}*/
		
		String frau = "Frau1";
		String mann = "Herr";
		int anzahlKurse = 3;
		String level = "Anfänger";
		
		if(frau.equals("Frau") || mann.equals("Herr") && (anzahlKurse < 3 || level.equals("Anfänger"))) {
			System.out.println("Kurs 145");
		} else {
			System.out.println("Kurs 148");
		}
		
		if(mann.equals("Herr") && anzahlKurse < 3 || level.equals("Anfänger")) {
			System.out.println("Kurs 145");
		} else {
			System.out.println("Kurs 148");
		}
	}

}
