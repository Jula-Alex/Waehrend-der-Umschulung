// operatoren3.c
#include <stdio.h>

int main() 
{
	int logo = 3;
	int x = 5, y = 0;
	
	printf("\nNegation: !%d = %d", logo, !logo);
	printf("\nNegation: !!%d = %d", x, !!x);
	
	logo = x && y;
	printf("\nkonditionales logisches UND: %d && %d = %d", x, y, logo);
	
	logo = y && ++x;   // 0 && egal
	printf("\nlogo = %d, x = %d, y = %d", logo, x, y);
	
	logo = ++y && x++; // 1 && 5
	printf("\nlogo = %d, x = %d, y = %d", logo, x, y);
	
	x = 0, y = 0;
	logo = x++ && ++y; // 0 && egal
	printf("\nlogo = %d, x = %d, y = %d", logo, x, y);
	
	
	x = 5, y = 0;
	logo = x || y;
	printf("\n\nkonditionales logisches ODER: %d || %d = %d", x, y, logo);
	
	logo = x || y++;  // 5 || egal
	printf("\n\nkonditionales logisches ODER: %d || %d = %d", x, y, logo);
	
	printf("");
	
	return 0;
}


