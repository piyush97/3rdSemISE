#include <stdio.h>

/**
 * Demonstrates concept of recursion
 */


int fib( int n)
{
	if(n==0) return 1;
	return n*fact(n-1);
}


int main ( void )
{
	int n;
	printf("Enter N to find N!:");
	scanf("%d",&n);
	printf("N! : %lf\n",fact(n));
	return 0;
}
