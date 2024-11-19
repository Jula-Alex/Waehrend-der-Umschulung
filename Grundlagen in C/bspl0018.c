// bspl0018.c
#include <stdio.h>

int main() 
{
	int monat, jahr;
	int tage;
	
	printf("Bitte Monat und Jahr eingeben (m-j)>");
	scanf("%d-%d", &monat, &jahr);
	
	if (jahr > 1582 && monat > 0 && monat < 13)
	{
		switch (monat) 
		{
		case 2:
			if (jahr % 400 == 0 || jahr %  4 == 0 && jahr % 100 != 0)
			{
				tage = 29;
			}
			else
			{
				tage = 28;
			}
			break;
		case 2*2: case 6: case 9: case 11:
			tage = 30;
			break;
		default:
		break;
			tage = 31;
		}	
		printf("Im Jahre %d hat der %d.Monat %d Tage.", jahr, monat, tage);
	}
	else 
	{
		printf("Ungueltige Eingabe!");
	}
	
	return 0;
}


