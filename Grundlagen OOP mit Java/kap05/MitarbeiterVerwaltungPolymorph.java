// kap05/MitarbeiterVerwaltungPolymorph.java

/*
* Polymorphie (Vielgestaltigkeit)
* Zur Laufzeit wird der tatsächliche Typ des Objektes ermittelt (späte Bildung)
* und dann die entsprechende Methode benutzt
*/

public class MitarbeiterVerwaltungPolymorph {
	public static void main(String[] args) {
		
		//gemeinsame Datenstruktur für alle MitarbeiterVerwaltungPolymorph
		
		//Vorsicht Datenstruktur ist mit fixe Größe
		Mitarbeiter[] mitarbeiter = new Mitarbeiter [3];
		
		//Angestellter
		mitarbeiter[0] = new Angestellter("Chico", "Marx", 2000.0); 
		
		//Lehrling
		mitarbeiter[1] = new Lehrling("Harpo", "Marx", 2000.0);
		
		//Chef		
		mitarbeiter[2] = new Chef("Groucho", "Marx", 2000.0); 
		
		//Automatische Anzeige der Array Grösse durch Variable array.length
		System.out.println("Daten für " + mitarbeiter.length + " Mitarbeiter:");
		
		for (Mitarbeiter m: mitarbeiter) {
			System.out.println("\n-------------------------------\n");
			m.zeigeDaten();
			System.out.println("\n-------------------------------\n");
		}
		
		//Casting Operator  - this is used because Mitarbeiter has no method "befoerdern"
		//Casting with () before execution of the Method
		((Angestellter) mitarbeiter[0]).befoerdern();
		
		//mitarbeiter[1] ist Lehrling - lässt sich übersetzen, aber führt zu ClassCastException
		//Exa -> try - catch
		try {
			((Angestellter) mitarbeiter[1]).befoerdern();
		//We may catch also the specific exception ClassCastException
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage() + "\nExceptionCause: " + e.getCause());
		}
		
		//Polymorphie - Es wird die Methode des Kindes zuerst ausgeführt
		//Wenn die Methode in der Kind-Classe nicht gibt, dann geht die JVM 
		//in der Eltern->Grosseltern Hierarchie weiter mit der Methode suche
		for (Mitarbeiter m: mitarbeiter) {
			m.erhoeheGehalt(500);
			System.out.println("\t erhoeheGehalt(500) von " + m.getClass().getName());
		}
		
		
		System.out.println("###Nach Gehaltserhöhung:");
		for (Mitarbeiter m: mitarbeiter) {
			m.zeigeDaten();
		}
	}
}


