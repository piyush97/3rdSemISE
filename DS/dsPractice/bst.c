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
 } 
