//Singly Linked List
#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
struct node 
{
	int info;
	struct node* link;
}*start=NULL;

void insertBeg(int item)
{
	struct node* newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	newnode->info=item;
	if(start==NULL)
	{
		newnode->link=NULL;
		
	}
	else
		newnode->link=start;
		start=newnode;
		return;

	

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
void deleteEnd()
{
	struct node* temp1;
	struct node* temp2=NULL;
	if(start==NULL)
	{
		printf("Linked List is empty\n");
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
			insertBeg(item);
			break;
			case 2:
			deleteEnd();
			break;
			case 3:
			display();
			break;
		}
	}
	return 0;
}