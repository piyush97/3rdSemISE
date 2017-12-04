#include <stdio.h>
#include <stdlib.h>
struct node
{
	int info;
	struct node *link;
}*last=NULL;
struct node *newnode;
void insertBeg(int item)
{
	newnode=(struct node*) malloc(sizeof(struct node));
	newnode->info=item;
	if(last==NULL)
	{
		newnode->link=newnode;
		last=newnode;
		return;
	}
	newnode->link=last->link;
	last->link=newnode;
}