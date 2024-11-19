// kap05/Chef.java

public class Chef extends Mitarbeiter {
	
	public Chef(String vorname, String nachname, double gehalt) {
		super(vorname, nachname, gehalt);
	}
	
	@Override
	public void erhoeheGehalt(double zuschlag) {
		super.erhoeheGehalt(2 * zuschlag);
	}
}