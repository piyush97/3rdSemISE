#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
struct node
 {
 	int info;
 	struct node *left,*right;
 }*root=NULL;

 void CreateBST(int item)
 {
 	struct node* newnode;
 	newnode=(struct node*) malloc(sizeof(struct node*));
 	newnode->info=item;
 	newnode->left=newnode->right;
 	if(root==NULL)
 	{
 		root=newnode;
 		return;
 	}
 	struct node* parent=NULL;
 	struct node* current=root;
 	while(current!=NULL)
 	{
 		parent=current;
 		if(item<=current->info)
 			current=current->left;
 		else
 			current=current->right;
 	}
 		if (item<parent->info)
 		{
 			parent->left=newnode;
 		}
 		else
 			parent->right=newnode;
 		return;

 } 
