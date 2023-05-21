#include<stdio.h>


int main()
{
	int a,b;
	scanf("%d %d", &a,&b);
	if (a == 1)
	{
		if (b == 2)printf("B");
		else printf("A");
	}
	else if (a == 2)
	{
		if (b == 2)printf("B");
		else printf("A");
	}
	else if (a == 3)
	{
		if (b == 1)printf("B");
		else printf("A");
	}
}