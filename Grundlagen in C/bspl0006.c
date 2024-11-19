// bspl0006.c
#include <stdio.h>

int main() 
{
	float x, y;

	printf("\t2. R e c h e n p r o g r a m m\n----------------------------\n");

	printf("Bitte 1.Wert eingeben>");
	scanf("%f", &x);
	
	printf("Bitte 2.Wert eingeben>");
	scanf("%f", &y);
	
	printf("\n%f + %f = %f", x, y, x+y);
	printf("\n%f - %f = %f", x, y, x-y);
	printf("\n%f * %f = %f", x, y, x*y);
	printf("\n%f / %f = %f", x, y, x/y);
	
	return 0;
}


