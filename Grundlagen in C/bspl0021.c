// bspl0021.c
#include <stdio.h>

int main() 
{
	printf("\n\tS t a t i s t i k\n-----------------------------------------\n");
	
	double zahl, summe = 0.0;
	int anzahl;
	
	printf("Wie viele Zahlen wollen Sie einlesen?");
	scanf("%d", &anzahl);
	
	for (int zaehler = 0; zaehler < anzahl; zaehler++)
	{
		printf("Bitte die %d.te Zahl eingeben>", zaehler + 1);
		scanf("%lf", &zahl);
		summe += zahl;
	}
	
	printf("\nSumme: %f, Mittelwert: %.2f", summe, summe / anzahl);
	
	return 0;
}


