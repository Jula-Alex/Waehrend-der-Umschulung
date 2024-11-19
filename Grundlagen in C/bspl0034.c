// bspl0034.c
#include <stdio.h>

double fakultaet(int n)
{
	double fak = 1.0;
	
	for (int zahl = 1; zahl <= n; zahl++)
	{
		fak *= zahl;
	}
	
	return fak;
}

int main() 
{
	printf("5! = %.0f", fakultaet(5));
	
	printf("\nMoeglichkeiten 6 aus 49 = %.0f", fakultaet(49) / fakultaet(43) / fakultaet(6));
	
	printf("\nPermutationen von 123 = %.0f", fakultaet(3));
	
	return 0;
}


