// kap04/ArrayDemo.java

//File name should correspond the class name
public class ArrayDemo {
	public static void main(String[] args) {
	
	//Array (Vektor, Eindimensionale Tabelle, Felder, Elemente, ... )
	//Array hat feste Größe. Elemente sind mehrere Variablen vom selben Typ.
	//Zugriff erfolgt über ein Index (--> Ordnung der Elemente im Array)
	// Erste Index ist 0
	
	//Deklaration + Initialisierung mit 5 Elemente
	int[] a = new int[5];

	
	System.out.println("Classic FOR");
	for (int i = 0; i < 5; i++) {
		a[i] = 2 * i + 1;
		System.out.println((i + 1) + ". Element a [" + i + "] = " + a[i]); // 1, 3, 5, 7, 9
	}
	
	System.out.println("FOR EACH, like in PYTHON, PHP or BASH");
	//for-each-Schleife: für Collections. Wie Python, PHP und BASH Arrays
	for (int tmp: a) {
		System.out.println(tmp);
		
	}
	
	
	
	//Bereiche Überwachen: Exception-Handling
	try {
	  // Java kontrolliert die Felder-grenzen!
		for (int i = 0; i <= 5; i++) {
			System.out.println("a [" + i + "] = " + a[i]);
		}
	}
	catch(Exception e) {
	  //  Block of code to handle errors
	   System.out.println("ERROR: Something went wrong. Error: " + e);
	   System.err.println("Indexfehler: " + e);
	}

	try {
	  // Java kontrolliert die Felder-grenzen!
		for (int i = 0; i <= 5; i++) {
			System.out.println("a [" + i + "] = " + a[i]);
		}
	}
	//Catch as not general exception
	catch(ArrayIndexOutOfBoundsException e) {
	  //  Block of code to handle errors
	   System.out.println("ERROR: Something went wrong. Error: " + e);
	   System.err.println("Indexfehler: " + e);
	}

	System.out.println("Hier ist wieder alles OK!");
	
	//Initialisation
	int[] b = {2, 4, 6};
	//SizeOf b
	System.out.println("b.length = " + b.length);
	
	//Field length: gibt es zu jedem Array
	for (int i = 0; i < b.length; i++) {
		System.out.println("b [" + i + "] = " + b[i]);
	}

	//zweidimensionales Array - Quadratisch 
	int row = 3;
	int column = 3;
	int[][] sudoku = new int[row][column];
	
	System.out.println(sudoku.length + "x" + sudoku[0].length + "-Tabelle");
	int zahl = 1;
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < column; j++) {
			sudoku[i][j] = zahl++;
			//System.out.print(" " + sudoku[i][j]);//Zeile nicht umbrechen mit "print".
			System.out.printf("%5d", sudoku[i][j]);
		}
		System.out.println();
	}



	
	System.out.println();
	
	//zweidimensionales Array - Flexibel
	char[][] feld = { {'A', 'B', 'C'}, {'D', 'E'}, {'F'}, {'G', 'H'} };
	
	int lengthOne = feld.length;	
	System.out.println("lengthOne: " + lengthOne); 
	System.out.println("lengthOne: " + feld[0].length);
	System.out.println("lengthOne: " + feld[1].length);
	
	//CHECK https://www.codingrooms.com/blog/2d-array-length-java


	for (int n = 0; n < feld.length; n++) {
		for (int m = 0; m < feld[n].length; m++) {
			//System.out.print(" " + feld[n][m]);
			System.out.printf("%4c", feld[n][m]);
		}
		System.out.println();
	}
	
		int[][] exampleVariableOne = new int[10][5];
		// returns the length of the rows in the array
		int lengthOne1 = exampleVariableOne.length;
		// returns the length of the columns in the array
		int lengthTwo = exampleVariableOne[0].length;

  
			System.out.println(lengthOne1);
			System.out.println(lengthTwo);
  
	
	}

	
	
}