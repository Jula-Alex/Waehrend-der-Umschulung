// bubbleSort.c
#include <stdio.h>

int main() 
{
	int a[] = {5, 17, 3, 8, 18, 12, 17, 5, 14, 1};
	int tmp;
	
	printf("Unsortiertes Array\n");
	for (int i = 0; i < 10; i++) 
	{
		printf("%3d", a[i]);
	}

	for (int i = 1; i <= 9; i++) 
	{
		for (int j = 9; j >= i ; j--)
		{
			if (a[j] < a[j-1])
			{
				tmp = a[j-1];
				a[j-1] = a[j];
				a[j] = tmp;
			}
		}
	}

	printf("\n\nSortiertes Array\n");
	for (int i = 0; i < 10; i++) 
	{
		printf("%3d", a[i]);
	}
	
	
	return 0;
}


