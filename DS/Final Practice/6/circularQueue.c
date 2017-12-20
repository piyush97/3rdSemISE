#include<stdio.h>
#define size 100
int cq[size],f=-1,r=-1,pop,count=0;
void insert()
{
	if(count==size)
		printf("Queue is full\n");
	else
	{
		if(r==-1)
		f=r=0;
		else
			r=(r+1)%size;
		printf("Enter the element\n");
		scanf("%d",&cq[r]);
		count++;
	}
	return;
}
void delete()
{
	if(count==0)
		printf("Queue is empty\n");
	else
	{
		printf("Deleted Element is %d\n",cq[f]);
		if(f==r)
			f=r=-1;
		else
			f=(f+1)%size;
		count--;
	}
	return ;
}
void display()
{
	int i,temp;
	if(count==0)
		printf("Queue is empty\n");
	else
	{
		printf("Queue elements are\n");
		temp=count;
		for(i=f;temp!=0;i++)
		{
			printf("%d ",cq[i]);
			temp--;
		}
		printf("\n");
	}
return;
}
void main()
{
	int ch;
	while(ch!=4)
	{
		printf(" 1 INSERT\n 2 DELETE\n 3 DISPLAY\n 4 EXIT\n");
		printf("Enter you choice\n");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				display();
				break;
			case 4:
				break;
		}
	}
}