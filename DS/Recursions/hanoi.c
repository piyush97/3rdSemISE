#include <stdio.h>
int count = 0;
void tower( int n, int source, int temp, int destination)
{
	if(n==1)
	{
		printf(" Move disk 1 from %c to %c\n",source,destination);
		count++;
		return;	
	}
	tower(n-1,source,destination,temp);
	printf("Move disk %d from %c to %c\n",n,source,destination);
	count++;
	tower(n-1,temp,source,destination);
}

int main ( void )
{
	int n;
	printf("Enter no of disks:");
	scanf("%d",&n);
	tower(n,'A','B','C');
	printf("No of operations: %d\n",count);
	return 0;
}
