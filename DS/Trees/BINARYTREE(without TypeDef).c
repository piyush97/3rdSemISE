struct node
{
	int info;
	struct node* left;
	struct node* right;
}root=NULL;
void makeTree(int item)
{
	struct node* newnode;
	newnode=(struct node*) malloc(sizeof(struct node));
	newnode->info=item;
	newnode->left=NULL;
	newnode->right=NULL;
	int i;
	char direction[10];
	if(root=NULL)
		root=newnode;
		return;
	printf("Enter L for adding at left and right for adding at right\n");
}