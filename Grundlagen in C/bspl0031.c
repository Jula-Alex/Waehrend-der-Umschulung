// bspl0031.c
#include <stdio.h>

void linie(int zeichen, int laenge)
{
	for (int i = 0; i < laenge; i++)
	{
		printf("%c", zeichen);
	}
} 

int main() 
{
	printf("Ich schreibe jetzt 10 Fragezeichen\n");
	linie('?', 10);
	
	int zeichen, anzahl;
	printf("\nWelches Zeichen?\n");
	zeichen = getchar();
	
	printf("Wie oft?\n");
	scanf("%d", &anzahl);
	
	linie(zeichen, anzahl);
	
	return 0;
}


