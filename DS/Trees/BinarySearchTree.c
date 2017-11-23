#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>
struct node
{
  int info;
  struct node *left,*right;
};

typedef struct node* NODE;

NODE getnode()
{
	NODE x;
	// Allocate memory on heap for size of node structure
	x= (NODE) malloc(sizeof(struct node));
	// Display a message incase of allocation failure
	if(x==NULL)printf("Node creation failure!\n");
	// Return a pointer to the newly created node
	return x;
}

NODE insert_bin( int  item, NODE root)
{
  NODE temp, prev, cur;
  temp = getnode();
  temp->info = item;
  temp->right = NULL;
  temp->left = NULL;
  if(root == NULL) return temp;
  prev = NULL;
  cur = root;
  while(cur!=NULL)
  {
    prev = cur;
    if(cur->info < item)
      cur = cur->right;
    else if(cur->info > item)
      cur = cur->left;
    else //element already exists in tree
    {
      free(temp);
      printf("\nElement exists in tree!\n");
      return root;
    }
  }
  if(prev->info <item)
    prev ->right = temp;
  else
    prev-> left = temp;
  return root;
}

void in_order(NODE root)
{
  if(root == NULL)
    return;
  in_order(root->left);
  printf("%d\t",root->info);
  in_order(root->right);
}

void pre_order(NODE root)
{
  if(root == NULL)
    return;
  printf("%d\t",root->info);
  pre_order(root->left);
  pre_order(root->right);
}
void post_order(NODE root)
{
  if(root == NULL)
    return;
  post_order(root->left);
  post_order(root->right);
  printf("%d\t",root->info);
}

NODE BinarySearch(NODE root, int item)
{
  NODE cur;
  int flag = 0;
  cur = root;
  if(cur == NULL)
  {
    printf("Tree empty!");
    return NULL;
  }
  while(cur!=NULL)
  {
    if(cur->info == item)
    {
      flag = 1;
      break;
    }
    else if(cur->info < item)
    {
      cur = cur->right;
    }
    else
    {
      cur = cur->left;
    }
  }
  if(flag == 1)
    return cur;
  else
    return NULL;
}


int main()
{
	NODE root = NULL, temp = NULL;
  int ch,data;
	do
	{
		printf("\n1. Insert Element\n");
		printf("2. In Order Traversal\n");
		printf("3. Pre Order Traversal\n");
    printf("4. Post Order Traversal\n");
    printf("5. Search for an element\n");
		printf("6. Exit\n");
		printf("Enter your choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			default:
				break;
			case 1:
				printf("Enter element to insert:");
				scanf("%d",&data);
				root = insert_bin(data,root);
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
        printf("Enter element to search for:");
        scanf("%d",&data);
        if((temp=BinarySearch(root,data))!=NULL)
          printf("\nFound %d in tree!\n",temp->info);
        else
          printf("\nElement not found in tree!\n");
        break;

		}
	}while(ch!=6);
	return 0;
}
