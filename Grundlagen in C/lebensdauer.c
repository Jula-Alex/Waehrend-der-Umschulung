// lebensdauer.c
#include <stdio.h>

// globale Variable: ist überall bekannt
int var;

int main() 
{
	int var = 7;
	
	printf("var = %d", var);
	
	{
		int var = -3;
		printf("\nvar = %d", var);
	}
	
	printf("\nvar = %d", var);
	
	return 0;
}


