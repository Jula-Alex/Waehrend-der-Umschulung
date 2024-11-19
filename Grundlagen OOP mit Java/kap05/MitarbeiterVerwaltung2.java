// kap05/MitarbeiterVerwaltung2.java

public class MitarbeiterVerwaltung2 {
	public static void main(String[] args) {
		
		//Referenz
		Mitarbeiter2this billy;
		
		//Instanziierung: Bilden einer Instanz (Objekts);
		billy = new Mitarbeiter2this("Bill", "Gates", 3000.0);
		
		Mitarbeiter2this steve = new Mitarbeiter2this("Steve", "Jobs", 2500.0);
		
		System.out.println("Mitarbeiter: " + billy);
		System.out.println("Mitarbeiter: " + steve);
		
		//billy.gehalt = -1000; //Unzulässige Wert für Gehalt, daher soll inhalt dieser Daten privat sein
		
		//Daten anzeigen
		billy.zeigeDaten();
		steve.zeigeDaten();
		
		//Gehalterhöhung
		billy.erhoeheGehalt(1000);
		steve.erhoeheGehalt(-500);
		
		//Daten anzeigen
		System.out.println("\nGehalt Erhöhung");
		billy.zeigeDaten();
		steve.zeigeDaten();
	}
}


