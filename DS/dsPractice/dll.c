#include<stdio.h>
#include<stdlib.h>
struct node{
int info;
struct node *left;
struct node *right;
}*start=NULL;
struct node *newnode;
struct node *temp,*temp1,*temp2;
void inbeg(int item)
{
	newnode=(struct node*) malloc(sizeof(struct node));
	newnode->info=item;
	newnode->left=NULL;
	if(start==NULL)
	{
		newnode->right=NULL;
		start=newnode;
		return;
	}
	newnode->right=start;
	start->left=newnode;
	start=newnode;
}
void inend(int item)
{
	newnode=(struct node*) malloc(sizeof(struct node));
	newnode->info=item;
	newnode->right=NULL;
	if(start==NULL)
	{
		newnode->left=NULL;
		start=newnode;
		return;
	}
	temp=start;
	while(temp->right!=NULL)
	{
		temp=temp->right;
	}
	temp->right=newnode;
	newnode->left=temp;

}

void delbeg()
{
	if(start==NULL)
	{
		printf("Empty\n");
		return;
	}
	if(start->right==NULL)
	{
		free(start);
		start=NULL;
		return;
	}
	start=start->right;
	free(start->left);
	start->left=NULL;
}
void delend()
{
	if(start==NULL)
	{
		printf("Empty\n");
		return;
	}
	if(start->right==NULL)
	{
		free(start);
		start=NULL;
		return;
	}
	temp=start;
	while(temp->right->right!=NULL)
	{
		temp=temp->right;
	}
	free(temp->right);
	temp->right=NULL;
}
void display()
{
	if(start==NULL)
	{
		printf("empty\n");
		return;
	}
	temp=start;
	while(temp!=NULL)
	{
		printf("%d\n",t->info );
		temp=temp->right;
	}
}
void main(){
int ch,n=1,item,p;
while(n>0)
{
printf("1.insert beg\n2.insert end\n3.insert at pos\n4.del at beg\n5.del end\n6.del pos\n7.dispaly\n8.exit");
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
default:n=0;
}
}
}