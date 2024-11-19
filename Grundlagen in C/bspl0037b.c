// bspl0037b.c
#include <stdio.h>
#include <string.h>

int main() 
{
	char truth[20] = "Elvis";
	
	strcat(truth, " is still ");
	
	strncat(truth, "alive!", 20 - strlen(truth) - 1);
	// truth[19] = 0;
	
	printf("truth: %s", truth);
	
	return 0;
}


