// bspl0005.c
#include <stdio.h>

int main() 
{
	// Variablen-Deklaration: typ bezeichner
	int x, y;

	printf("\t1. R e c h e n p r o g r a m m\n----------------------------\n");

	printf("Bitte 1.Wert eingeben>");
	scanf("%d", &x);
	
	printf("Bitte 2.Wert eingeben>");
	scanf("%d", &y);
	
	printf("\n%i + %i = %i", x, y, x+y);
	printf("\n%i - %i = %i", x, y, x-y);
	printf("\n%i * %i = %i", x, y, x*y);
	printf("\n%i / %i = %i", x, y, x/y);
	printf("\n%i %% %i = %i", x, y, x%y);
	
	return 0;
}


