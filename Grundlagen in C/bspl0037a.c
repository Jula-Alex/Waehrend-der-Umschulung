// bspl0037a.c
#include <stdio.h>
#include <string.h>

/* String (Zeichenkette, Folge von Character)
   charakterisiert durch "": Literal "Hallo"
*/
int main() 
{
	printf("Speicherbedarf von \"Hallo\": %d Byte\n", sizeof("Hallo"));
	
	
	char text[10];
	
	// text = "Hallo"; geht NICHT!
	strcpy(text, "Hallo");
	
	printf("Groesse des char-Arrays: %d Byte\n", sizeof(text));
	printf("text: %s\n", text);
	printf("Anzahl der Zeichen: %d\n", strlen(text));
	
	text[3] = '\0';
	printf("text: %s\n", text);
	printf("Anzahl der Zeichen: %d\n", strlen(text));
	
	strncpy(text, "Gruess Gott", 10);
	text[9] = 0;
	printf("text: %s\n", text);
	printf("Anzahl der Zeichen: %d\n", strlen(text));
	
	return 0;
}


