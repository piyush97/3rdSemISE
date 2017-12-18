//Binary Search Tree
#include<stdio.h>
#include<stdlib.h>
struct node
{
	int info;
	struct node *left;
	struct node *right;
}*root=NULL;

void insertion(int item)
{
	struct node *newnode;
	newnode=(struct node*)malloc (sizeof(struct node));
	newnode->info=item;
	newnode->left=newnode->right=NULL;
	
}