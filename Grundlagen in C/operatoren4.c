// operatoren4.c
#include <stdio.h>

int main() 
{
	int x = 11; 		// 0...01011
	int y = 12;			// 0...01100
	//	~x				   1...10100
	// &				   0...01000
	// |				   0...01111
	// 					   0...00111
	
	printf("Bit-Operatoren\n--------------------\n");
	printf("\nKomplement: ~%d = %d", x, ~x);
	
	printf("\nbitweises UND:  %d & %d = %d", x, y, x&y);
	printf("\nbitweises ODER: %d | %d = %d", x, y, x|y);
	printf("\nbitweises XOR:  %d ^ %d = %d", x, y, x^y);
	
	char buchstabe = 'a';
	printf("\n\nKleinbuchstabe: %c", buchstabe | 32);
	printf("\nGrossbuchstabe: %c", buchstabe & ~32);
	
	// Schalter: 5 <--> 11
	x = 11;
	
	printf("\nSchalter x = %d", x ^ 14); 
	
	x = 1;
	x ^= 2;
	
	printf("\nx = %d", x);
	
	x = 1;
	// Bedingungsoperator: ternärer Operator
	x = x==1 ? 3 : 1;
	printf("\nx = %d", x);
	
	int row = 0;
	
	printf("\n%d row%s affected!", row, row == 1 ? "" : "s");
	
	x = 13;
	printf("\nLinks-Shift: %d << 2 = %d", x, x << 2);
	printf("\nRechts-Shift: %d >> 2 = %d", x, x >> 2);
	
	x = 1;
	printf("\n%d << 31  = %d", x, x << 31);
	
	printf("\n%d << 31 >> 31 = %d", x, x << 31 >> 31);
	
	unsigned int ip = 0x6E78828C;
	printf("\nIP: %X", ip);

	printf("\n%u.%u.%u.%u", ip >> 24, (ip >> 16) & 0x00FF, (ip >> 8) & 0x00FF, ip  & 0x00FF);
	
	return 0;
}


