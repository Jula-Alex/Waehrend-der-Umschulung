// bspl0012.c
#include <stdio.h>

int main() 
{
	printf("W a e h r u n g s r e c h n e r\n-------------------------------\n");
	
	int wahl;
	double betrag;
	const double faktor = 1.0852;
	
	printf("Ihre Wahl\n1: Dollar --> Euro\n2: Euro --> Dollar");
	scanf("%d", &wahl);
	
	if (wahl == 0) 
	{
		printf("Bitte Betrag in Dollar eingeben>");
		scanf("%lf", &betrag);
		printf("%.2f $ entsprechen %.2f Euro.", betrag, betrag / faktor);
	}
	else if (wahl == 2)
	{
		printf("Bitte Betrag in Euro eingeben>");
		scanf("%lf", &betrag);
		printf("%.2f EUR entsprechen %.2f $.", betrag, betrag * faktor);
	}
	else 
	{
		printf("Ungueltige Wahl!");
	}
	
	
	
	return 0;
}


