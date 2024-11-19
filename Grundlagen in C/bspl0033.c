// bspl0033.c
#include <stdio.h>

int max(int a, int b) 
{
	if (a > b) {
		return a;
	}
	
	return b;
}


int main() 
{
	int maximum;
	int anzahl, zahl;
	
	printf("Wieviele Zahlen?");
	scanf("%d", &anzahl);
	
	if (anzahl < 1) 
	{
		return 1;
	}
	
	printf("Bitte die 1.Zahl eingeben>");
	scanf("%d", &zahl);
	
	maximum = zahl;
	
	for (int i = 2; i <= anzahl; i++)
	{
		printf("Bitte die %d.Zahl eingeben>", i);
		scanf("%d", &zahl);
		maximum = max(maximum, zahl);
	}
	
	printf("Maximum: %d", maximum);
	
	return 0;
}


