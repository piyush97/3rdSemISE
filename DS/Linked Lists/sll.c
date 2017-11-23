#include <stdio.h>
#include<stdlib.h>
struct NODE
{
	int INFO;
	struct NODE* LINK;//for making like [node1]->[node2]
}*START=NULL; //node type variable/pointer start
void InsertBeg(int item)
{
	struct NODE* newnode;//node type newnode
	newnode=(struct NODE*) malloc(sizeof(struct NODE));
	newnode->INFO=item;//storing the information in the info of newnode 
	if(START==NULL)//if empty we will make the link point null like [newnode]->NULL which means its the starting element
	{
		newnode->LINK=NULL;
	}
	else //if not empty
		newnode->LINK=START;//[newnode]->START 
		START=newnode;//pointer at start so that next time the element gets inserted here! (IMP)
		return;
}
//insert and end
void InsertEnd(int item)
{
	struct NODE* newnode;
	struct NODE* TEMP=NULL;
	newnode=(struct NODE*) malloc(sizeof(struct NODE));
	newnode->INFO=item;
	newnode->LINK=NULL;
	if(START==NULL)
	{
		START=newnode;
		return;
	}
	else
	{
		TEMP=START;
		while(TEMP->LINK!=NULL)
			TEMP=TEMP->LINK;
			TEMP->LINK=newnode;
			return;
	}
}
//insertion at any position
void InsertPos(int item,int pos)
{
	int c=1;
	struct NODE* newnode;
	newnode=(struct NODE*) malloc(sizeof(struct NODE));
	newnode->INFO=item;
	if (START==NULL && pos==1)
	{
		newnode->LINK=NULL;
		START=newnode;
		return;
	}
	else if(START==NULL&&pos>1)
	{
		printf("INVALID POSTIION\n");
		return;
	}
	else if(START!=NULL &&pos==1)
	{
		newnode->LINK=START;
		START=newnode;
		return;
	}
	struct NODE* TEMP=START;
	while(TEMP!=NULL && c!=(pos-1))
	{
		TEMP=TEMP->LINK;
		c++;
	}
	if(TEMP==NULL)
	{
		printf("Invalid position\n");
		return;
	}
	newnode->LINK=TEMP->LINK;
	TEMP->LINK=newnode;
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
}
void main()
{
	int ch,x,pos;
	while(ch!=5)
	{
		printf("enter choice \n 1 for insertion at begining \n 2 for insertion at any position \n 3 for display \n 4 for insertion at end");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				printf("Enter the value\n");
				scanf("%d",&x);
				InsertBeg(x);
				break;
			case 2:
				printf("Enter position and element");
				scanf("%d %d",&pos,&x);
				InsertPos(x,pos);
				break;
			case 3:
				printf("THe link list is\n");
				display();
				break;
			case 4:
			printf("Enter the element\n");
			scanf("%d",&x);
			InsertEnd(x);
			break;
		}
	}
}
	
