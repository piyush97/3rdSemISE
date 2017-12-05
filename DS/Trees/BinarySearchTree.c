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
	newnode->left=newnode->right=NULL;

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

//function to count number of nodes in binary search Tree
int count(struct NODE *root)
{
	if(root==NULL)
		return(0);
	else
		if(root->left==NULL && root->right==NULL)
			return 1;
		else
			return(1+(count(root->left)+count(root->right)));
}
//function to swap subtrees
struct NODE *SwapTree(struct NODE *root)
{
	struct NODE *temp1=NULL,*temp2=NULL;
	if(root!=NULL)
	{
		temp1=SwapTree(root->left);
		temp2=SwapTree(root->right);
		root->right=temp1;
		root->left=temp2;
	}
	return root;
}
int main()
{
	int item;
	int flag=0;
	int key;
	int choice=0;
	while(choice!=7)
	{
		printf("\n1. Create a bst\n 2.preOrder \n3.postOrder \n4.inOrder \n5. for number of nodes \n6. To Swap The Tree");
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
			case 5:
				printf("The Number of nodes are %d",count(root));
				break;
			case 6:
				printf("The tree after swapping is\n");
				root=SwapTree(root);
				inOrder(root);
				printf("The original tree was\n");
				root=SwapTree(root);
				inOrder(root);
				printf("This was the inOrder Representation :D\n");
				break;
		}
	}
	return 0;
}