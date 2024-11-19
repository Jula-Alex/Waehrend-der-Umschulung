// bspl0025b.c
#include <stdio.h>
#include <conio.h>

int main() 
{
	int eingabe;
	
	do
	{
		printf("Schleifenkoerper\n\n");
		printf("Weiter mit bel. Taste\nEnde mit <ESC>");
		eingabe = getch(); // Taste
		
	} while (eingabe != 27);
	
	printf("\nEnde Programm");
	
	return 0;
}


