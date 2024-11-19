// bspl0022a.c
#include <stdio.h>

int main() 
{
	printf("\nK l e i n e s  1 x 1\n----------------------\n");
	
	// geschachtelte Schleife: Schleife innerhalb einer Schleife
	
	// äußere Schleife
	for (int i=1; i <= 16; i++)
	{
		// innere Schleife
		for (int j=1; j <= 16; j++) 
		{
			printf("%4X", i * j);
		}
		
		printf("\n");
	}
	
	
	printf("");
	
	return 0;
}


