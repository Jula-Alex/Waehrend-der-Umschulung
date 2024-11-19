// bspl0039.c
#include <stdio.h>
#include <string.h>

int main() 
{
	char satz[80];
	
	printf("\nBitte einen Satz eingeben>");
	fgets(satz, 80, stdin);
	satz[strlen(satz)-1] = '\0';
	
	int i = 0;
	
	while (satz[i])
	{
		printf("%c", satz[i++]);
	}
	
	unsigned char zeichen = 'ö';
	printf("\n\nzeichen = %d", zeichen);
	
	return 0;
}

