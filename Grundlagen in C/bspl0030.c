// bspl0030.c
#include <stdio.h>

void neue_zeile(int anzahl)
{
	for (int i = 0; i < anzahl; i++)
	{
		printf("\n");
	}
	anzahl = -1;  // hat keine Auswirkungen
}

int main() 
{
	printf("%d\n", j);
	// call by value
	neue_zeile(3);
	
	printf("%d\n", j);
	printf("1.Satz");
	
	neue_zeile(1+3);
	printf("2.Satz");
	
	int anzahl;
	printf("\nWieviele neue Zeilen?");
	scanf("%d", &anzahl);
	
	neue_zeile(anzahl);
	printf("3.Satz. anzahl = %d", anzahl);
	
	return 0;
}


