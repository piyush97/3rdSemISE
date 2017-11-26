#include <stdio.h>
#include <stdlib.h>
struct node
{
	int info;
	struct node* link;	
}*start=NULL;

void InsertBeg(int item)
{
	struct node* newnode;
	newnode=(struct node) malloc(sizeof(struct node));
	newnode->info=item;
	if(start==NULL)
		newnode->link=NULL;

	else
		newnode->link=start;
		start=newnode;
		return;
}
void deleteBeg()
{
	struct node* temp=NULL;
	if(start==NULL)
	{
		printf("Linked List is Empty\n");
		return;
	}
	else
	{
		temp=start;
		printf("%d\n",start->info );
		start=start->link;
		free(temp);
		return;
	}
}
void insertEnd(int item)
{
	struct node* newnode;
	struct node* temp=NULL;
	newnode=(struct node*) malloc(sizeof(struct node));
	newnode->info=item;
	newnode->link=NULL;
	if(start==NULL)
	{
		start=newnode;
		return;
	}
	else
	{
		temp=start;
		while(temp->link!=NULL)
		temp=temp->link;
	temp->link=newnode;
	return;
	}
}
void deleteEnd()
{
	struct node* temp1,temp2=NULL;
	if (start==NULL)
	{
		printf("Linked List is Empty");
		return;
	}
	else if(start->link==NULL)
	{
		free(start);
		start=NULL;
		return;
	}
	else
	{
		temp1=start;
		while(temp1->link!=NULL)
		{
			temp2=temp1;
			temp1=temp1->link;
		}	
		temp2->link=NULL;
		printf("%d\n",temp1->info );
		free(temp1);
		return;
	}
}
void display()
{
	struct NODE* TEMP=NULL;
	if(START==NULL)
	{
		printf("SLL IS EMPTY\n");
		return;
	}
	else
	{
		TEMP=START;
		while(TEMP!=NULL)
		{
			printf("%d\n",TEMP->INFO );
			TEMP=TEMP->LINK;
		}
	return;	
}
void insertPos(int item, int pos)
{
int c=1;
struct node* newnode;
newnode=(struct node*)malloc(sizeof(struct node));
newnode->info=item;
if(start==NULL && pos==1)
{
	newnode->link=NULL;
	start=newnode;
	return;
}	
else if(start==NULL && pos>1)
{
	printf("Invalid position\n");
}
else if(start!=NULL && pos==1)
{
	newnode->link=startl
	start=newnode;
	return;
}
struct node* temp=start;
while(temp!=Null && c!=(pos-1))
{
	temp=temp->link;
	c++;
}
if(temp==NULL)
{
	printf("Invalid Position");
	return;
}
newnode->link=temp->link;
temp->link=newnode;
}

int main()
{
		int ch,x,pos;
	while(ch!=6)
	{
		printf("enter choice \n 1 for insertion at begining \n 2 for insertion at any position \n 3 for display \n 4 for insertion at end \n 5 for delete from beinging \n 6 for insertion at any position");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				{printf("Enter the value\n");
				scanf("%d",&x);
				InsertBeg(x);
				break;}
			
			case 2:
				{printf("Enter position and element");
				scanf("%d %d",&pos,&x);
				InsertPos(x,pos);
				break;}
			
			case 3:
				{printf("THe link list is\n");
				display();
				break;}
			
			case 4:
				{printf("Enter the element\n");
				scanf("%d",&x);
				InsertEnd(x);
				break;}
			
			case 5:
				{DeleteBegining();
				break;}
			case 6:
				printf("Enter the position \n");
				scanf("%d",&pos);
				printf("Enter the element\n");
				scanf("%d",&x);
				InsertPos(x,pos);
				break;

		}
	}
}
	
