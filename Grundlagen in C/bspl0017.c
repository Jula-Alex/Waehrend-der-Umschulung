// bspl0017.c
#include <stdio.h>

int main() 
{
	int x, y;
	
	printf("Wahrheitstafel fuer XOR\n-----------------------------\n");
	
	x = 0, y = 0;
	
	int xor = x && !y || !x && y;
	
	printf("%2d XOR %2d: %d\n", x, y, xor);
	
	x = 0, y = 1;
	xor = x && !y || !x && y;
	printf("%2d XOR %2d: %d\n", x, y, xor);
	
	x = 1, y = 0;
	xor = x && !y || !x && y;
	printf("%2d XOR %2d: %d\n", x, y, xor);
	x = 1, y = 1;
	xor = x && !y || !x && y;
	printf("%2d XOR %2d: %d\n", x, y, xor);
	
	return 0;
}


