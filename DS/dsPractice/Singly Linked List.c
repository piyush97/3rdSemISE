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