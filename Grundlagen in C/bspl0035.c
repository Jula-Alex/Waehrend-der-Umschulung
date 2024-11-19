// bspl0035.c
#include <stdio.h>

int main() 
{
	double d = 47.11, e = 11.0;
	
	// Prototyping
	double func(double, double);
	
	printf("Funktionswert: %f", func(d, e));
	
	return 0;
}

// lokale Funktion
double func(double a, double b) 
{
	return a / b;
}



