#include<stdio.h>
#include<stdlib.h>
struct node
{
	int info;
	struct node *link;
}*last=NULL;
struct node *temp;
struct node *temp1;
struct node *temp2;
void inbeg(int item)
{
	struct node* newnode;
	newnode=(struct node*) malloc(sizeof(struct node));
	newnode->info=item;
	if(last==NULL)
	{ //same line in each insert case
		newnode->link=newnode;
		last=newnode;
		return;
	}
	newnode->link=last->link;
	last->link=newnode;
}
void inend(int item)
{
	struct node* newnode;
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
	last=newnode;
}
void inp(int item,int p)
{
	int c=1;
	struct node* newnode;
	newnode=(struct node*) malloc(sizeof(struct node));
	newnode->info=item;
	if (last==NULL &&p==1)
		{

			newnode->link=newnode;
			last=newnode;
			return;
		}
	if(last==NULL && p>1)
	{
		printf("Invalid position\n");
		return;
	}
	if(last->link==last && p==1)
	{
		newnode->link=last->link;
		last->link=newnode;
		return;
	}
	if(last->link!=last && p==1)
	{
		newnode->link=last->link;
		last->link=newnode;
		return;
	}
	struct node *temp=NULL;
	struct node *temp1=NULL;
	temp=last->link;
	temp1=last->link;
	while(temp->link!=temp1 && c!=(p-1))
	{
		temp=temp->link;
		c++;
	}
	if(temp==last)
	{
		newnode->link=temp->link;
		temp->link=newnode;
		last=newnode;
		return;
	}
	newnode->link=temp->link;
	temp->link=newnode;
}

void delbeg()
{
	if (last==NULL)
	{
		printf("Empty\n");
		return;
	}
	if(last->link==last)
	{
		free(last);
		return;
	}
	struct node *temp;
	temp=last->link;
	last->link=temp->link;
	free(temp);
}

void delend()
{
	if(last==NULL)
		{
			printf("Empty\n");
			return;
		}
	if(last->link==last)
	{
		free(last);
		last=NULL;
		return;
	}
	struct node *temp;
	struct node *temp1=NULL;
	struct node *temp2;
	temp=last->link;
	while(temp->link->link!=temp1)
	{
		temp=temp->link;
	}
	temp2=last;
	temp->link=temp1;
	last=temp;
	free(temp2);
}

void delp(int p)
{
	int c=1;
	if(last==NULL)
	{
		printf("Empty\n");
		return;
	}
	if(last->link==last && p==1)
	{
		free(last);
		last=NULL;
		return;
	}
	temp=last->link;
	while(temp->link!=temp && c!=p)
	{
		temp1=temp;
		temp=temp->link;
		c++;
	}
	if(temp==last)
	{
		last=temp1;
		temp1->link=temp->link;
		free(temp);
		return;
	}
	if(last->link!=last && p==1)
	{
		last->link=temp->link;
		free(temp);
		return;
	}
	temp1->link=temp->link;
	free(temp);
}
void display()
{
	if(last==NULL)
		{printf("Empty"); return;}
	struct node *temp;
	temp=last->link;
	while(temp!=last)
	{
		printf("%d \n",temp->info );
		temp=temp->link;
	}
	printf("%d\n",temp->info );
}

void main(){
int ch,item,p;
while(ch!=8)
{
printf("1.insert beg\n2.insert end\n3.insert at pos\n4.del at beg\n5.del end\n6.del pos\n7.display\n8.exit");
scanf("%d",&ch);
switch(ch){
case 1:printf("enter the item\n");
       scanf("%d",&item);
       inbeg(item);
break;
case 2:printf("enter the item\n");
scanf("%d",&item);
inend(item);
break;
case 3:printf("enter the item and pos\n");
scanf("%d%d",&item,&p);
inp(item,p);break;
case 4:delbeg();
break;
case 5:delend();
break;
case 6:printf("enter the  pos\n");
scanf("%d",&p);
delp(p);
break;
case 7:display();
break;
}

}

























}