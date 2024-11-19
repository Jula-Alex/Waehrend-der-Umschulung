// bspl0029.c
#include <stdio.h>

/*
	Funktion (Subroutine, Unterprogramm, ....)
	1, Schritt zur Modularisierung
	Deklaration:
	typ nameDerFunktion(Parameter);
	typ: Rückgabewert
	Parameter: Argumente
*/

// Deklaration
// vor main --> global (überall bekannt)
void loesche_bild();

int main(void) 
{
	int x, y, z;
	
	// Aufruf einer Funktion
	loesche_bild();
	printf("\nBitte x eingeben>");
	scanf("%d", &x);
	loesche_bild();
	printf("\nBitte y eingeben>");
	scanf("%d", &y);
	loesche_bild();
	printf("\nBitte z eingeben>");
	scanf("%d", &z);
	
	loesche_bild();
	printf("\n%d + %d + %d = %d", x, y, z, x+y+z);

	return 0;
}

// Definition
void loesche_bild()
{
	for (int i = 0; i < 25; i++)
	{
		printf("\n");
	}
}


