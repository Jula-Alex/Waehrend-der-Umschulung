// kap05/Mitarbeiter.java

public class Mitarbeiter {

	//Attribute - Attribute sollen geschützt werden
	private String vorname;
	private String nachname;
	private double gehalt;

	// If there is no defined constructor the standard constructor is valid


	//Standard-Konstruktor - sieht so aus wenn nichts definiert ist
	Mitarbeiter(){
		vorname = "N.";
		nachname = "N.";
		gehalt = 0.0;
	}

	
	//Non-Standard Constructor - construct object with values
	Mitarbeiter(String vorname, String nachname, double gehalt){
		this.vorname = vorname;
		this.nachname = nachname;
		this.gehalt = gehalt;
	}

	//Methoden - sind public damit Zugriff darauf für alle erlaubt ist
	public void zeigeDaten() {
		//Polymorphie exa
		//getClass ist methode von Object, Object is the root class of all java-classes
		//getClass().getName() - definition of Classname - Show the type of the object
		System.out.println("---> getClass().getName() of Mitarbeiter: " + getClass().getName());
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


