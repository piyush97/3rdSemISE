#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct node
{
	int info;
	struct node* left;
	struct node* right;
}*root=NULL;
void makeTree(int item)
{
	struct node* newnode;
	struct node* parent;
	struct node* current;
	newnode=(struct node*) malloc(sizeof(struct node));
	newnode->info=item;
	newnode->left=NULL;
	newnode->right=NULL;
	int i;
	char direction[10];
	if(root==NULL)
		newnode=root;
		return;
	printf("Enter L for adding at left and right for adding at right\n");
	scanf("%s",direction);
	parent=NULL;
	current=root;
  for(i=0;direction[i]!='\0' && current!=NULL; i++)
	{
		parent=current;
		if(direction[i]=='L')
			current=current->left;
		else
			current=current->right;

	}
	if(current!=NULL||i!=strlen(direction))
	{
		printf("Insertion failure\n");
		free(newnode);
		/*root=newnode;*/
		return;
	}
	if(direction[i-1]=='L')
		parent->left=newnode;
	else
		parent->right=newnode;
	return;
}
void in_order(struct node *root)
{
	if(root!=NULL)
	{	in_order(root->left);
	printf("%d\n",root->info );
	in_order(root->right);
}
}
void pre_order(struct node *root)
{
  if(root != NULL)
   {
  printf("%d\t",root->info);
  pre_order(root->left);
  pre_order(root->right);
}
}
void post_order(struct node *root)
{
  if(root != NULL)
{  post_order(root->left);
  post_order(root->right);
  printf("%d\t",root->info);
}
}
int main()
{
  int ch,data;
        do
        {
                printf("\n1. Insert Element\n");
                printf("2. In Order Traversal\n");
                printf("3. Pre Order Traversal\n");
    			printf("4. Post Order Traversal\n");
                printf("5. Exit\n");
                printf("Enter your choice:");
                scanf("%d",&ch);
                switch(ch)
                {
                        default:
                                break;
                        case 1:
                                printf("Enter element to insert:");
                                scanf("%d",&data);
                                makeTree(data);
                                break;
                        case 2:
      							  printf("\nIn Order Traversal is:\n");
                                in_order(root);
                                break;
                        case 3:
                                printf("\nPre Order Traversal is:\n");
       							 pre_order(root);
                                break;
                        case 4:
                        printf("\nPost Order Traversal is:\n");
     					 post_order(root);
                        break;
                        case 5:
                                break;

                }
        }while(ch!=5);
        return 0;
}