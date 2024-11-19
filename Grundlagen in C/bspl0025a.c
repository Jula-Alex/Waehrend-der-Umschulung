// bspl0025a.c
#include <stdio.h>

int main() 
{
	int zahl;
	
	do
	{
		printf("Bitte eine Zahl zwischen 10 und 100 eingeben>");
		scanf("%d", &zahl);
		
	} while (zahl < 10 || zahl > 100);
	
	printf("zahl = %d", zahl);
	
	return 0;
}


