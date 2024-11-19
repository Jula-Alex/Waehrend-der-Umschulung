// bspl0032.c
#include <stdio.h>

int max(int a, int b) 
{
	if (a > b) {
		return a;
	}
	
	return b;
}


int main() 
{
	int maximum;
	
	maximum = max(4, 5);
	
	printf("Maximum: %d", maximum);
	
	return 77;
}


