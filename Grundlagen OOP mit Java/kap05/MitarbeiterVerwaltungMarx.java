// kap05/MitarbeiterVerwaltung.java

public class MitarbeiterVerwaltungMarx {
	public static void main(String[] args) {
		
		Angestellter chico = new Angestellter("Chico", "Marx", 2000.0);
		
		System.out.println("Daten: ");
		chico.zeigeDaten();
		System.out.println("-------------------------------------");
		//Das folgende geht nicht, da Hierachiestufe in Angestellter private ist.
		//System.out.println("Hierarchietufe: " + chico.hierarchieStuffe);
		
		// Das folgende geht durch die Methode dazu
		System.out.println("Hierarchietufe: " + chico.getHierarchieStufe());
		
		chico.erhoeheGehalt(500.0);
		chico.befoerdern();
		System.out.println("Mit Erhöter Gehalt und befördert: ");
		chico.zeigeDaten();
	}
}


