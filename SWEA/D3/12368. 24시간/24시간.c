#include<stdio.h>
int main()
{
	int t, a, b, sum = 0;
	scanf("%d", &t);
	for (int i = 1; i <= t; i++)
	{
		scanf("%d %d", &a, &b);
		sum = a+b;
		sum %= 24;
		printf("#%d %d\n", i,sum);
		sum = 0;
	}
	
}