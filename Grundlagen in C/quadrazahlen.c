// quadratzahlen.c
#include <stdio.h>

int main() 
{
	int zahl;
	int i, delta = 1;
	
	printf("Bitte eine Zahl eingeben>");
	scanf("%d", &zahl);
	
	for (i = 1; i < zahl; i += delta)
	{
		// printf("%d\n", i);
		delta += 2;
	}
	
	printf("%d ist %seine Quadratzahl.\n", zahl, (i==zahl)?"":"k");
	
	return 0;
}


