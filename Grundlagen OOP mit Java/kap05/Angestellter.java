//kap05/Angestellter.java

//Angestellter "ist ein Mitarbeiter"

public class Angestellter extends Mitarbeiter {

	public static final int MAXHIERARCHIE = 5; //Definition Konstante
	private int hierarchieStufe;
	
	public Angestellter(String vorname, String nachname, double gehalt){
		//Aufruf des Konstruktors der Super-Klasse: muss immer die erste Anweisung sein
		//Vorsicht hier wird u.U. der default-Konstruktor der Super-Klasse aufgerufen
		//super();
		
		//Daher - 
		//Parameterübergabe über die entsprechend definierten Konstruktor mit Parameter der Superklasse
		super (vorname, nachname, gehalt);
		hierarchieStufe = 1;
		
	}
	
	@Override
	public void zeigeDaten() {
		super.zeigeDaten();
		System.out.println("Hierarchietufe: " + hierarchieStufe);
	}
	
	public void befoerdern(){
		if (hierarchieStufe < MAXHIERARCHIE){
			hierarchieStufe++;
		}
			
	}
	
//---------------------------------
	//Beispiel getter-Methode - Read-Only-Methode
	public int getHierarchieStufe(){
		//kann auch mit this.hierarchieStufe, wenn der Kontext nicht klar ist.
		//Auch Typ-Sicherheit
		return hierarchieStufe;  
	}
	
}