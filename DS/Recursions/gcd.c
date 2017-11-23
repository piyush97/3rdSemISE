#include <stdio.h>

/**
 * Demonstrates concept of recursion
 */


int gcd( int m, int n)
{
	if(!n) return m;
	if(n>m)return gcd(n,m);
	return gcd(n,m%n);
}


int main ( void )
{
	int m, n;
	printf("Enter 2 numbers to find gcd:");
	scanf("%d %d",&m,&n);
	printf("GCD of %d & %d: %d\n",m,n,gcd(m,n));
	return 0;
}
