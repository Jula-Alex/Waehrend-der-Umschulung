// ean.c
#include <stdio.h>

int checkEAN(long long ean) 
{
	int pz;
	int gewicht;
	
	pz = 0;
	gewicht = 1;
	
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
	
	
	return !pz;
}

int main()
{
	printf("%d", checkEAN(4260664872757));
}


