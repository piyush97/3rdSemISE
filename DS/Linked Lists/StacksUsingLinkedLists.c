//implementing stacks using linked lists
struct node
{
	int data;
	struct node *link;
};
//push
struct node *push(struct node *start,int value)
{
	struct node* newnode;
	newnode=(struct node* )malloc (struct node);
	if(newnode==NULL)
	{
		printf("OverFlow\n");
		exit (0);
	}
	newnode->data=value;
	newnode->link=start;
	start=newnode;
	return start;

}