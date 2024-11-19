// bspl0023.c
#include <stdio.h>

int main() 
{
	int zahl;
	
	printf("Bitte zahl eingeben (0 fuer Ende)>");
	scanf("%d", &zahl);
	
	while (zahl != 0)
	{
		printf("%d ^ 3 = %d\n", zahl, zahl * zahl * zahl);
		printf("Bitte zahl eingeben (0 fuer Ende)>");
		scanf("%d", &zahl);
	}
	
	return 0;
}


