// bspl0036b.c
#include <stdio.h>

int main() 
{
	int a[5] = {1, 3, 5};
	
	for (int i = 0; i < 5; i++)
	{
		printf("a[%d] = %d\n", i, a[i]);
	}
	
	// ACHTUNG: C kontrolliert die Feldergrenzen NICHT!
	
	printf("Bitte einen Wert eingeben>");
	scanf("%d", &a[5]);
	
	printf("a[5] = %d\n", a[5]);  // a[5] existiert NICHT: Speicherstelle hinter a[4]
	
	return 0;
}