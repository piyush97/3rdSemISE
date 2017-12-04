#include<stdio.h>
#include<stdlib.h>
struct node
{
	int info;
	struct node *left;
	struct node *right;
}*start=NULL;

void create(int item)
{
	struct node *newnode;
	struct node *temp;
	newnode=(struct node*) malloc(sizeof(struct node));
	newnode->info=item;
	newnode->left=newnode->right=NULL;
	if(start==NULL)
	{
		start=newnode;
		return;
	}
	temp=start;
	while(temp->right!=NULL)
	{
		temp=temp->right;
	}
	while(temp!=NULL)
	{
		if(temp->info<=item)
		{
			newnode->right=NULL;
			temp->right=newnode;
			newnode->left=temp;
			return;
		}
	
		else
		{
			temp=temp->left;

		}
	}
	newnode->right=start;
	start->left=newnode;
	start=newnode;

}
void display()
{
	struct node *temp;
	temp=start;
	while(temp!=NULL)
	{
		printf("\n%d \n",temp->info );
		temp=temp->right;
	}
}
int main()
{
	int choice,item;
	while(choice!=3)
	{
		printf("\nEnter 1 for insertion 2 for display\n");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
			printf("Enter the number to insert\n");
			scanf("%d",&item);
			create(item);
			break;

			case 2:
			display();
			break;
		}
	}
}