// kap03/Datentypen.java

//File name should correspond the class name
public class Datentypen {
	
	public static void main(String[] args) {
		///////////////////////////////////////////////
		//Ganzzahlige Datentypen Zahlen
		///////////////////////////////////////////////
		System.out.println("\nganzzahliger Datentyp");
		
		// "023" Oktalzahl - 4 Byte
		int iZahl = 023;
		System.out.println("int: iZahl = " + iZahl);
		
		// "L" für Longdefinition, ohne "L" ist normales int - 8 Byte
		long lZahl  = 2500000000L;
		System.out.println("long: lZahl = " + lZahl);
		
		// Vorsicht explizites Type-Casting notwendig - 2 Byte
		short sZahl  = (short) iZahl;
		System.out.println("short: sZahl = " + sZahl);
		
		// Bytezahl - 1 Byte (1 Vorzeichenbit und 7 Zahlbits)
		byte bZahl = 127;
		bZahl++;
		System.out.println("byte: bZahl = " + bZahl);
		
		// Bytezahl2 - Binary Notation mit "0b"
		byte bZahl2 = 0b110011;
		bZahl2++;
		System.out.println("byte: bZahl2 = " + bZahl2);
		
		// Bytezahl3 - Lesbarkeit
		byte bZahl3 = 0b11_00_11;
		bZahl3++;
		System.out.println("byte: bZahl3 = " + bZahl3);
		
		// Bytezahl4 - Vorsicht typeCasting "int" ist default, ohne (byte) Überlauf.
		byte bZahl4 = (byte) 0b1100_0011;
		bZahl4++;
		System.out.println("byte: bZahl4 = " + bZahl4);
		
		///////////////////////////////////////////////
		//Fließkomma Datentypen Zahlen
		///////////////////////////////////////////////

		System.out.println("\nFließkomma Datentyp");
		
		//Vorsicht - Aufrundungen - siehe https://www.h-schmidt.net/FloatConverter/IEEE754.html
		
		//Float
		float fZahl  = 2.3F;
		System.out.println("float: fZahl = " + fZahl);
		
		//Float
		double dZahl  = 2.3;
		System.out.println("float: dZahl = " + dZahl);
		
		///////////////////////////////////////////////
		//Buchstaben - char
		///////////////////////////////////////////////
		
		System.out.println("\nUnicode-Zeichen");
		char zeichen = 'A';
		System.out.println("zeichen = " + zeichen);
		
		//Unicode-Eingabe
		zeichen = '\u00e6';
		System.out.println("zeichen = " + zeichen);
		
		//HEX-Eingabe
		zeichen = 0xe7;
		System.out.println("zeichen = " + zeichen);
		
		//ASCII-Nummer-Eingabe, siehe https://www.w3schools.com/java/java_data_types_characters.asp
		zeichen = 49; // '1'
		System.out.println("zeichen = " + zeichen);
		
		///////////////////////////////////////////////
		//Boolean 
		///////////////////////////////////////////////
		System.out.println("\nboolscher-Zeichen");
		boolean logo = true;
		System.out.println("logo = " + logo);
		
		//Vorsicht - kein Typecasting zwischen Boolean und Integer
		//Siehe auch https://www.baeldung.com/java-boolean-to-int
		// 4 > 3 > 2 führt zum Fehler!!
		
		///////////////////////////////////////////////
		//Unbestimmte variable für Zahlen
		///////////////////////////////////////////////
		var x = 2L; //hier long Zuweisung

	}
	
	
}