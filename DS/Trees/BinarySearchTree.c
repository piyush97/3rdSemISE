#include <stdio.h>
#include <stdlib.h>
struct NODE
{
	int info;
	struct NODE* left,right;
}*root=NULL;
void bst(int item)
{
	struct NODE* newnode;
	newnode=(struct NODE*) malloc (sizeof(struct NODE));
	newnode->info=item;
	newnode->left=newnode->right;

	if (root==NULL)
	{
		root=newnode;
		return;
	}
	struct NODE* parent=NULL;
	struct NODE* curr=root;
	while(curr!=NULL)
	{
		parent=curr;
		if(item<=curr->info)
		{
			curr=curr->left;
		}
		else
		{
			curr=curr->right;
		}
	}
		if (item<=parent->info)
		{
			parent->left=newnode;
		}
		else
			parent->right=newnode;
		return;
	}
void preOrder(struct NODE *root)
{
	if(root!=NULL)
	{
		printf("%d\n", root->info);
		preOrder(root->left);
		preOrder(root->right);
	}
}
