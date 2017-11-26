#include <stdio.h>
#include <stdlib.h>
struct NODE
{
	int info;
	struct NODE* left;
	struct NODE* right;
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
void postOrder(struct NODE *root)
{
	if (root!=NULL)
	{
		postOrder(root->left);
		postOrder(root->right);	
		printf("%d\n", root->info);
	}
}
void inOrder(struct NODE *root)
{
	if (root!=NULL)
	{
		inOrder(root->left);
		printf("%d\n", root->info);
		inOrder(root->right);	
	}
}
int main()
{
	int item;
	int flag=0;
	int key;
	int choice=0;
	while(choice!=5)
	{
		printf("\n1. Create a bst\n 2.preOrder \n3.postOrder \n4.inOrder");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
				printf("Enter an item\n");
				scanf("%d",&item);
				bst(item);
				break;
			case 2:
				preOrder(root);
				break;
			case 3:
				postOrder(root);
				break;
			case 4:
				inOrder(root);
				break;
		}
	}
	return 0;
}