//TOH
#include <stdio.h>
#include <stdlib.h>
void TOH(int n, char a,char b,char c)
{
	if(n==1)
		printf("Move disk no %d from %c to %c\n",n,a,c);
	else
	{
		TOH(n-1,a,c,b);
		printf("Move disk no %d from %c to %c\n",n,a,c );
		TOH(n-1,b,a,c);
	}
}
int main()
{
	int no;
	printf("Enter the number of disks\n");
	scanf("%d",&no);
	TOH(no,'A','B','C');
	return 0;
}