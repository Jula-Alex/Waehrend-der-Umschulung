//kap06/StringDemo.java - nicht String nennen, da Java-Wrapper Classe mit gleichen Namen schon gibt.


public class StringDemo {

	public static void main (String[] args) {
		
		//Ein String/Zeichenkette ist immutable (nicht mehr zu verändern)
		//String ist gut als Container, aber nicht als Klasse zur Manipulation von Daten (weil immutable)
		String s1 = "Java"; //s1 is a reference to the Object "Java"
		
		char data[] = {'J', 'a', 'v', 'a'};
		String s2 = new String(data); //2en String 
		//Erzeugung von s2 wird erzwungen, obwohl String mit Inhalt "Java" schon gibt
		
		//String vergleiche
		//Referenz
		if (s1 == s2) {
			System.out.println("s1 und s2 Referenzen - gleich");
		} else {
			System.out.println("s1 und s2 Referenzen - ungleich");
		}
		
		//Inhalt
		if (s1.equals(s2)) {
			System.out.println("s1 und s2 Inhalt - gleich");
		} else {
			System.out.println("s1 und s2 Inhalt - ungleich");
		}
		
		//Case-Sensitivity
		String s3 = "java";
		if (s1.equals(s3)) {
			System.out.println("Case-Sensitivity - equals: s1 und s3 Inhalt - gleich");
		} else {
			System.out.println("Case-Sensitivity - equals: s1 und s3 Inhalt - ungleich");
		}
		
		//Case-Sensitivity - equalsIgnoreCase
		String s4 = "java";
		if (s1.equalsIgnoreCase(s4)) {
			System.out.println("Case-Sensitivity - equalsIgnoreCase: s1 und s4 Inhalt - gleich");
		} else {
			System.out.println("Case-Sensitivity - equalsIgnoreCase: s1 und s4 Inhalt - ungleich");
		}
		
		System.out.println("s1.compareTo(s3) = " + s1.compareTo(s3)); // compare le due Stringe e appena qualcosa non quandra mostra la differenza nella Tabella ASCII
		
		System.out.println("In Großbuchstaben: " + s1.toUpperCase());
		System.out.println("In Kleinbuchstaben: " + s1.toLowerCase());
		
		
		//See also, public String toUpperCase(Locale locale)
		s2 = "ß";
		System.out.println("ß -> "+ s2.toUpperCase());
		System.out.println("ß -> "+ s2.toLowerCase());
		System.out.println("ß -> "+ s2.toUpperCase().toLowerCase());
		
		//length of String s4
		System.out.println("s4: " + s4 + ": Laenge von s4: " + s4.length());
		
		//Konkatenation
		String truth = "Elvis";
		truth = truth + " is still";
		//truth = truth.concat (" alive"); 
		//Aufpassen - nur ###truth.concat (" alive")### ist nur flüchtig in Speicher, da nicht referenziert
		truth = truth.concat(" aliv").concat("e!").toUpperCase();
		System.out.println("truth: " + truth);
		//An dieser Stelle sind die freigegebenen Referenzen auf Strings "Elvis" und " is still"
		//bereit für Garbage-Collection durch JVM.
		
		s1 = "heinz@web.de";
		//VORSICHT wir zählen ab 0 und (length - 1) ist der letzter Zeichen
		System.out.println("1. Zeichen von s1: '" + s1.charAt(0) + "'");
		System.out.println("Letzte Zeichen von s1: '" + s1.charAt(s1.length()-1) + "'");
		
		//gültige Email Adresse
		System.out.println("Position von @ ist: " + s1.indexOf('@'));
		
		//mehrere Positionen
		System.out.println("s1 is: '"+ s1 +"'");
		
		int position = 0;
		int count = 0;
		while (position < s1.length())
		{
			System.out.println("Index von e: " + s1.indexOf('e', position));
			position = s1.indexOf('e', position) + 1;
			count++;
			System.out.print("position: " + position + "; count: " + count + "\n");
		}
		System.out.println("Found 'e'-s: "+ count);
		
		//EMail - Domain Filter und User-Name
		System.out.println("Domain: " + s1.substring(s1.indexOf('@') + 1));//Hintere Teilstring
		System.out.println("User-Name: " + s1.substring(0, s1.indexOf('@')));//Vordere Teilstring
		
		//Comma-Separated-Values Format 1
		String csv = "Max;Musterman;AnyStreet 1;12345;AnyCity";
		System.out.println("\t#" + csv);
		
		//Demo - Tokens - Anhand des Delimiters in Token zerlegen
		String[] tokens = csv.split(";");
		for (String s : tokens) {
			System.out.println("\t#" + s);
		}
		
		//Comma-Separated-Values Format 2
		csv = "\nMax\"Musterman\"  AnyStreet 1  \"12345\"AnyCity";
		System.out.println("\t##" + csv);
		
		//Demo - Tokens - Anhand des Delimiters in Token zerlegen
		tokens = csv.split("\"");
		for (String s : tokens) {
			System.out.println("\t##" + s.trim()); // trim aggisce anche su \n, cioe lo elimina
		}
		
		int wert = 0x234; // 2 * 16 + 3 = 35 --> 35 * 16 + 4 = 564; Horner-Schema Hexa
		int wert2 = 0234; // 2 * 8 + 3 = 19 --> 19 * 8 + 4 = 156 ; Horner-Schema Octa
		System.out.println("s1: "+s1+" + wert: "+wert);
		//dirty s1 = "" + wert; so wird zum einem String aber schmutzlich gemacht 
		s1 = String.valueOf(wert); // so macht man Richtig! 
		System.out.println("Jetzt ist s1: " + s1 + " als String!");
	}
}

