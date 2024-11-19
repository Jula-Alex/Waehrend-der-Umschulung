// kap05/MitarbeiterVerwaltung.java

public class MitarbeiterVerwaltung {
	public static void main(String[] args) {
		
		//Referenz
		Mitarbeiter billy;
		
		//Instanziierung: Bilden einer Instanz (Objekts);
		billy = new Mitarbeiter("Bill", "Gates", 3000.0);
		
		Mitarbeiter steve = new Mitarbeiter("Steve", "Jobs", 2500.0);
		Mitarbeiter gio = new Mitarbeiter();
		gio.zeigeDaten();
		
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


