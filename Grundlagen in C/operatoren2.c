// operatoren2.c
#include <stdio.h>

int main() 
{
	int x = 17, y;
	
	x = x + 1;	
	printf("\nx = %d", x);
	
	x += 2 * 3; 
	printf("\nx = %d", x);
	
	x /= 2 + 1;  // x = x / (2 + 1)
	printf("\nx = %d", x);
	
	// Inkrement-Operator
	x = 7;
	// Präfix-Form
	y = ++x;
	printf("\nx = %d, y = %d", x, y);
	
	x = 7;
	// Postfix-Form
	y = x++;
	printf("\nx = %d, y = %d", x, y);
	
	// Dekrement-Operator
	x = 7;
	// Präfix-Form
	y = --x;
	printf("\nx = %d, y = %d", x, y);
	
	x = 7;
	// Postfix-Form
	y = x--;
	printf("\nx = %d, y = %d", x, y);
	
	
	double d = 0.2, e;
	
	e = d--;
	printf("\nd = %f, e = %f", d, e);
	
	x = 12, y = 1;
	
	// Cast-Operator (typ)
	e =   x / (double) y;
	printf("\ne = %f", e);
	
	double pi = 1234567893.1415926535897932384626433832795;
	float f = (float) pi;
	printf("\npi = %f\nf =  %f", pi, f);
	
	return 0;
}


