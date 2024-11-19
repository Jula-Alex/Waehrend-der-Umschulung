// bspl0036a.c
#include <stdio.h>

int main() 
{
	/* höherer Datentyp Array (Vektor, Tabelle, ...)
		mehrere Variablen von einem Typ
	   mit einer Ordnung: 1., 2., ... Element
	   
	   Deklaration:
	   typ nameDesArray[groesse];
	   
	   Zugriff erfolgt mit dem Index: 
	   1. Index: 0
	*/
	
	double wasserstand[7];
	double mittelwert = 0.0;
	
	printf("Speicherbedarf: %d Byte\n", sizeof(wasserstand));
	int n = sizeof(wasserstand) / sizeof(double);
	
	for (int i = 0; i < n; i++)
	{
		printf("Bitte das %d.te Element eingeben>", i + 1);
		scanf("%lf", &wasserstand[i]);
		mittelwert += wasserstand[i];
	}

	for (int i = 0; i < n; i++)
	{
		printf("%f\n", wasserstand[i]);
	}
	
	mittelwert /= n;
	printf("\nMittelwert: %.2f", mittelwert);
	
	return 0;
}


