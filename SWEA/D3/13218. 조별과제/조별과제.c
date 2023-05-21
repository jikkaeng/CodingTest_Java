#include<stdio.h>
int main()
{
	int t, n, m;
	scanf("%d", &t);
	for (int i = 1; i <= t; i++)
	{
		scanf("%d", &n);
		m = n / 3;
		printf("#%d %d\n", i, m);
	}
}