// ean.c
#include <stdio.h>

int main() 
{
	long long ean;
	int pz;
	int gewicht;
	
	printf("Bitte EAN eingeben>");
	scanf("%lld", &ean);
	
	
	printf("EAN: %lld", ean);
	
	pz = 0;
	gewicht = 3;
	
	while (ean > 0) 
	{
		pz += (int) (ean % 10) * gewicht;
		ean /= 10;
		gewicht = gewicht == 3 ? 1 : 3;
		// Alternative: gewicht ^= 2;
	}
	
	pz %= 10;
	
	if (pz > 0)
	{
		pz = 10 - pz;
	}
	
	// Alternative: pz = (pz > 0) ? 10 - pz : 0;
	
	
	printf("\nZiffer: %d", pz);
	
	
	return 0;
}


