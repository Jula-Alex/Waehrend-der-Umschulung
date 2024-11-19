// bspl0006a.c
#include <stdio.h>

int main() 
{
	double x, y;

	printf("\t2. R e c h e n p r o g r a m m\n----------------------------\n");

	printf("Bitte 1.Wert eingeben>");
	scanf("%lf", &x);
	
	printf("Bitte 2.Wert eingeben>");
	scanf("%lf", &y);
	
	printf("\n%.15f + %.15f = %.15f", x, y, x+y);
	printf("\n%.15f - %.15f = %.15f", x, y, x-y);
	printf("\n%.15f * %.15f = %.15f", x, y, x*y);
	printf("\n%.15f / %.15f = %.15f", x, y, x/y);
	
	return 0;
}


