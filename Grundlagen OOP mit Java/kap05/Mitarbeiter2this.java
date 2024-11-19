// kap05/Mitarbeiter2this.java

public class Mitarbeiter2this {

	//Attribute - Attribute sollen geschützt werden
	private String vorname;
	private String nachname;
	private double gehalt;

	// If there is no defined constructor the standard constructor is valid

/*	
	//Standard-Konstruktor - sieht so aus wenn nichts definiert ist
	Mitarbeiter2this(){
		vorname = null;
		nachname = null;
		gehalt = 0.0;
	}
*/
	
	//Non-Standard Constructor - construct object with values
	Mitarbeiter2this(String vorname, String nachname, double gehalt){
		this.vorname = vorname;
		this.nachname = nachname;
		this.gehalt = gehalt;
	}

	//Methoden - sind public damit Zugriff darauf für alle erlaubt ist
	public void zeigeDaten() {
		System.out.println(vorname + " " + nachname);
		System.out.println("Gehalt: " + gehalt + "$");
	}
	
	public void erhoeheGehalt(double betrag)	{
		if (betrag > 0){
			gehalt += betrag;
		} else 
			System.out.println("Negative Beträge sind nicht zulässig");
	}	
}


