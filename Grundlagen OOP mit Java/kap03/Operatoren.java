// kap03/Operatoren.java

//File name should correspond the class name
public class Operatoren {
	
		public static void main(String[] args) {
			///////////////////////////////////////////////
			//Arithmetische Operatoren
			///////////////////////////////////////////////
				
			int a = 17, b = 4;
			
			System.out.println("\narithmetische Operatoren");
			//Vorsicht: String-Concatenation
			System.out.println("Adition-Concatenation: " + a + "+" + b + "="  + a + b);
			
			//Summe
			System.out.println("Adition-Summe: " + a + "+" + b + "="  + (a + b));
			
			System.out.println("Subtraktion: " + a + "-" + b + "="  + (a - b));
			
			System.out.println("Multiplikation: " + a + "*" + b + "="  + (a * b));
			
			System.out.println("ganzzahlige Division: " + a + "/" + b + "="  + (a / b));
			
			System.out.println("Modulo: " + a + "%" + b + "="  + (a % b));
			
			double c = 17.0, d = 2.5;
			
			System.out.println("double Division: " + c + "/" + d + "="  + (c / d));
			
			System.out.println("double Modulo: " + c + "%" + d + "="  + (c % d));
			
			///////////////////////////////////////////////
			//Vergleichsoperatoren
			///////////////////////////////////////////////
			System.out.println("\nVergleichsoperatoren");
			
			System.out.println("grösser: " + a + ">" + b + " -> "  + (a > b));
			System.out.println("grösser gleich: " + a + ">=" + b + " -> "  + (a >= b));
			System.out.println("kleiner: " + a + "<" + b + " -> "  + (a < b));
			System.out.println("kleiner gleich: " + a + "<=" + b + " -> "  + (a <= b));
			System.out.println("gleich: " + a + "==" + b + " -> "  + (a == b));
			System.out.println("ungleich: " + a + "!=" + b + " -> "  + (a != b));
			
			///////////////////////////////////////////////
			//Inkrement-Operator (Dekrement ist ähnlich)
			///////////////////////////////////////////////
			System.out.println("\nInkrement-Operator");
			
			//Präfixform
			a = 3;
			b = ++a;
			
			System.out.println("++a a = " + a + ", b =" + b);
			
			
			//Postfixform
			a = 3;
			b = a++;
			
			System.out.println("a++ a = " + a + ", b =" + b);
			
			///////////////////////////////////////////////
			//Boolsche-Operator
			///////////////////////////////////////////////
			System.out.println("\nBoolsche-Operator");
			
			boolean logo = true;
			System.out.println("Negation: !" + logo + " = " + !logo);
			
			//Conditional Logic AND
			a = 3;
			b = 5;
			logo = a > 3 && b++ > 4;
			
			System.out.println("konditionales logisches UND: logo = " + logo + ", b =" + b);
			
			//NON-conditional Logic AND - Eventually bullshit code - reconsider example wrt bitwise AND, see below
			a = 3;
			b = 5;
			logo = a > 3 & b++ > 4;
			
			System.out.println("logisches UND: logo = " + logo + ", b =" + b);
			
			
			//Conditional Logic OR
			a = 3;
			b = 5;
			logo = a > 3 || b++ > 4;
			
			System.out.println("konditionales logisches ODER: logo = " + logo + ", b =" + b);
			
			//NON-conditional Logic AND - Eventually bullshit code - reconsider example wrt bitwise OR, see below
			a = 3;
			b = 5;
			logo = a > 3 | b++ > 4;
			
			System.out.println("logisches ODER: logo = " + logo + ", b =" + b);


			///////////////////////////////////////////////
			//Bit-Operatoren
			///////////////////////////////////////////////
			System.out.println("\nBit-Operatoren");
			a = 13; //0...01101
			b = 10; //0...01010
			
			System.out.println("bitwise UND: " + (a & b));
			System.out.println("bitwise ODER: " + (a | b));
			System.out.println("bitwise XOR: " + (a ^ b));
			System.out.println("Komplement: " + ~a);
			System.out.println("Links-Shift: " + (byte) (a << 2));
			System.out.println("Rechts-Shift Vorzeichnen-Füller>>: " + (byte) (a >> 2));
			//Unsigned Right Shift - 
			//It is the same as the signed right shift, but the vacant leftmost position is filled with 0 instead of the sign bit.
			System.out.println("Rechts-Shift Null-Füller>>>: " + (byte) (a >>> 2));
			
			a = -14;
			System.out.println("Rechts-Shift Null-Füller mit -14>>>: " + (byte) (a >>> 2));
			
			
			//Vorsicht Vorzeichen-Verlust beim Schieben
			a = 1;
			System.out.println("Vorzeichen-Verlust beim Schieben: a=1; a << 31 >> 31: Result:" + (a << 31 >> 31));
			
			//Roll-Operatoren für Zahlen gibt es in der Integer-Classe aber nicht als einfache Operatoren
		}

}