// operatoren1.c
#include <stdio.h>

int main() 
{
	int x, y = 7;

	x = y == 7;
	
	printf("Vergleichsoperatoren\n---------------------\n");
	
	printf("\nkleiner:         %d <  %d = %d",  x, y, x < y);
	printf("\nkleiner gleich:  %d <= %d = %d",  x, y, x <= y);
	printf("\ngroesser:        %d >  %d = %d",  x, y, x > y);
	printf("\ngroesser gleich: %d >= %d = %d",  x, y, x >= y);
	printf("\ngleich:          %d == %d = %d",  x, y, x == y);
	printf("\nungleich:        %d != %d = %d",  x, y, x != y);
	
	printf("\n4 > 3 > 2: %d", 4 > 3 > 2);
	
	printf("");
	
	return 0;
}


