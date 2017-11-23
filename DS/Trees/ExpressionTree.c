#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>
#include <math.h>
struct node
{
  struct node *left;
  int info;
  struct node *right;
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

NODE create_tree(char postfix[])
{
  NODE temp, st[20];//st = stack
  int i,k;
  char symbol;
  for (i=k=0;(symbol=postfix[i])!='\0';i++)
  {
    temp = getnode();
    temp->info = symbol;
    temp->left = temp ->right = NULL;
    if(isalnum(symbol))
    {
      st[k++]= temp;
    }
    else
    {
      temp->right = st[--k];
      temp->left = st[--k];
      st[k++] = temp;
    }
  }
  return st[--k];
}

float eval(NODE root)
{
  float num;
  switch(root->info)
  {
    case '+': return eval(root->left)+ eval(root->right);
    case '-': return eval(root->left)- eval(root->right);
    case '/': return eval(root->left)/eval(root->right);
    case '*': return eval(root->left)*eval(root->right);
    case '$':
    case '^': return pow(root->left->info, root->right->info);
    default:
      if(isalpha(root->info))
      {
        printf("Enter No. to Replace %c : ", root->info);
        scanf("%f",&num);
        return num;
      }
      else
        return root->info - '0';

  }
}


int main()
{
  char postfix[20];
  float res;
  NODE root;
  printf("Enter postfix expression:");
  scanf("%s",postfix);
  root = create_tree(postfix);
  res = eval(root);
  printf("Result is %f\n",res);
}
