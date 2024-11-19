// bspl0036c.c
#include <stdio.h>

int main() 
{
	int a[3] = {1, 3, 5};
	int n = sizeof(a) / sizeof(int);
	
	
	for (int i = 0; i < n; i++)
	{
		printf("a[%d] = %d\n", i, a[i]);
	}
	
	// 2-dim. Array
	int feld[3][4] = { {1, 3, 5}, {7}, {9, 2, 4, 5} };
	
	feld[0][13] = 66;
	
	for (int row = 0; row < 3; row++)
	{
		for (int column = 0; column < 4; column++)
		{
			printf("%2d", feld[row][column]);
		}
		printf("\n");
	}
	
	printf("\n\n%2d\n\n", feld[0][13]);
	
	char schach[8][8] = { {'T', 'S', 'L', 'D', 'K', 'L', 'S', 'T'} };
	
	for (int column = 0; column< 8; column++) 
	{
		schach[1][column] = 'B';
		schach[6][column] = 'b';
	}
	
	for (int column = 0; column< 8; column++) 
	{
		schach[7][column] = schach[0][column] + 32;
	}
	
	for (int i = 2; i < 6; i++)
	{
		for (int j = 0; j < 8; j++)
		{
			schach[i][j] =  (i+j) % 2 ? '_':' ';
		}
	}
	
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 8; j++)
		{
			printf("%2c", schach[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}