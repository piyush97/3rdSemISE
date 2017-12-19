//gcd using recursion
#include<stdio.h>
int gcd(int m,int n)
{
	if(!n)
		return m;
	if(n>m)
		return gcd(n,m);
	return gcd(n,m%n);
}
int main()
{
	int m,n;
	printf("enter 2 no\n");
	scanf("%d%d",&n,&m);
	printf("GCD is %d\n",gcd(n,m) );
	return 0;
}