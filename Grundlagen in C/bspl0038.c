// bspl0038.c
#include <stdio.h>
#include <string.h>

int main() 
{
	char satz[80];
	
	printf("\nBitte einen Satz eingeben>");
	fgets(satz, 80, stdin);
	satz[strlen(satz)-1] = '\0';
	
	int i = 0;
	
	while (satz[i] != '\0')
	{
		printf("%c", satz[i]);
		i++;
	}
	
	return 0;
}


