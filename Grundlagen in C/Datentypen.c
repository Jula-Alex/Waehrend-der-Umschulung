// datentypen.c
#include <stdio.h>

int main() 
{
	// ganzzahlig
	signed short int sZahl = 32767;
	int iZahl = 017;
	long lZahl = 42L;
	long long llZahl = 123456789012345LL;

	sZahl = sZahl + 1;
	
	printf("\nshort: Speicherbedarf: %d Byte\nszahl = %d, %o, %X", sizeof(sZahl), sZahl, sZahl, sZahl);
	
	printf("\nint: Speicherbedarf: %d Byte\nizahl = %d, %o, %X", sizeof(iZahl), iZahl, iZahl, iZahl);

	printf("\nlong: Speicherbedarf: %d Byte\nlzahl = %ld, %o, %X", sizeof(lZahl), lZahl, lZahl, lZahl);
	
	printf("\nlong long: Speicherbedarf: %d Byte\nllzahl = %lld, %llo, %llX", sizeof(llZahl), llZahl, llZahl, llZahl);
	
	// Fließkommazahlen
	
	float fZahl = 47.11F;
	double dZahl = 12.3e-3;
	
	printf("\nfloat: Speicherbedarf: %d Byte\nfZahl = %f, %e, %g", sizeof(fZahl), fZahl, fZahl, fZahl);
	
	printf("\ndouble: Speicherbedarf: %d Byte\ndZahl = %lf, %le, %lg", sizeof(dZahl), dZahl, dZahl, dZahl);
	
	// Zeichen (ASCII-Character)
	char zeichen = 'A';
	printf("\nchar: Speicherbedarf: %d Byte\ndzeichen = %c, ASCII: %d", sizeof(zeichen), zeichen, zeichen);
	
	zeichen = 0123;
	printf("\nzeichen = %c", zeichen);
	
	// boolescher Wert existiert NICHT
	// Emulation über 0 (false), !0 (true)
	
	return 0;
}


