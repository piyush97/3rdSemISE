//Singly Linked List
#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
struct node 
{
	int info;
	struct node* link;
}*start=NULL;

void InsertEnd(int item)
{
	struct NODE* newnode;
	struct NODE* TEMP=NULL;
	newnode=(struct NODE*) malloc(sizeof(struct NODE));
	newnode->INFO=item;//inserts the item
	newnode->LINK=NULL;//check if it points to something (CHECKS IF THE LL IS EMPTY)
	if(START==NULL)//if it is null
	{
		START=newnode;//it is definately the first element
		return;
	}
	else//if it is not the first element
	{
		TEMP=START; 
		while(TEMP->LINK!=NULL)//till the end
			TEMP=TEMP->LINK; 
			TEMP->LINK=newnode;//temp points to the new node which is the last element in the linked list
			return;
	}
}
void display()
{
	struct node* temp=NULL;
			temp=start;
			if(start==NULL)
			{
				printf("Empty\n");
				return;
			}
	while(temp!=NULL)
	{
		printf("%d\n",temp->info );
		temp=temp->link;
	}
}
void DeleteBegining()
{
	struct NODE* TEMP=NULL;
	if(START==NULL)
	{
		printf("SLL IS EMPTY \n");
		return;
	}
	else
	{
		TEMP=START;
		printf("%d",START->INFO);
		START=START->LINK;
		free(TEMP);
		return;
	}
}
int main()
{
	int choice,item;
	while (choice!=4)
	{
		printf("Enter 1 for insertion 2 for deletion and 3 for display\n");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
			printf("Enter the element \n");
			scanf("%d",&item);
			InsertEnd(item);
			break;
			case 2:
			DeleteBegining();
			break;
			case 3:
			display();
			break;
		}
	}
	return 0;
}