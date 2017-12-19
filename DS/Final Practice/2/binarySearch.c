//binary Search
#include<stdio.h>
#include<stdlib.h>
int bs(int element,int a[],int low,int high)
{
	int mid;
	if(low>high)
		return -1;
	mid=(low+high)/2;
	if(a[mid]==element)
		return mid;
	else if(a[mid]>element)
		return bs(element,a,low,mid-1);
	else
		return bs(element,a,mid+1,high);
}
int main()
{
	int n,a[1000],item,i;
	printf("Enter The Number of Elements\n");
	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	
		printf("Enter the element to search for\n");
		scanf("%d",&item);
		i=bs(item,a,0,n-1);
		if(i==-1)
			printf("Item no found\n");
		else
			printf("item found at position %d\n",i+1 );
return 0;

	

}