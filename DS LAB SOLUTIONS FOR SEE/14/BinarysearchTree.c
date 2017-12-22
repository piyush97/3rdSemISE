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
	if (item<=parent->info)
	{
		parent->left=newnode;
	}
	else
		parent->right=newnode;
	return;
}
void inOrder(struct node* root)
{
	if(root!=NULL)
	{
		inOrder(root->left);
		printf("%d\n",root->info );
		inOrder(root->right);
	}
}
void display(struct node* root,int spaces)
{
    if(root!=NULL)
    {
    int i;
    display(root->right, spaces + 3);
    for( i = 0; i < spaces; i++ )
    printf("");
    printf("%d\n",root->info);
    display(root->left, spaces + 3);
    return;
    }
}
int main()
{
	int choice,item;
	
	while(choice!=3)
	{printf("\n Press 1 for insertion\n2. for display");
	scanf("%d",&choice);
	switch(choice)
	{
		case 1:
		printf("Enter the element\n");
		scanf("%d",&item);
		insertion(item);
		break;
		case 2:
		display(root,1);
		break;
	}
	
}
return 0;
}