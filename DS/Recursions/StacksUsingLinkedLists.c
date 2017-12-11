#include<stdio.h>
#include <stdlib.h>
struct node
{
  int data;
  struct node* link;
};
struct node *push(struct node* p, int value)
{
  struct node *newnode;
  newnode=(struct node*)malloc(sizeof(struct node));
  if(newnode==NULL)
  {
    printf("Memory not available\n" );
    exit(0);
  }
  newnode->data=value;
  newnode->link=p;
  p=newnode;
  return p;

}

struct node *pop(struct node* p,int *value)
{
  struct node* newnode;
  if(p==NULL)
  {
    printf("Stack is empty\n");
    exit(0);
  }
  *value=p->data;
  newnode=p;
  p=p->link;
  free(newnode);
  return p;

}
struct node *display(struct node* p)
{
if(p==NULL)
 { printf("Stack is empty\n");
  exit(0);
  }
  while(p!=NULL){
printf("%d\n",p->data );
p=p->link;
}
}
void  main()
{
  struct node *top=NULL;
  int n,value;
while(n!=4)
{
  printf("press 1 for push \n 2 for pop \n 3 for display \n 4 for exit" );
  scanf("%d",&n );
  switch (n) {
    case 1:
    printf("Enter the element to be pushed\n");
    scanf("%d", &value);
    top=push(top,value);
    break;

    case 2:
    top=pop(top,&value);
    printf("The item poped is %d\n",value);
    break;
    case 3:
   top= display(top);
   break;
  }
}
}
