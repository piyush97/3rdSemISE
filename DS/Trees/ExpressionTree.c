#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<math.h>
struct node
{
  char info;
  struct node* llink;
  struct node* rlink;
};
typedef struct node* NODE;
NODE getnode()
{
  NODE x=(NODE)malloc(sizeof(struct node));
  return x;
}
void display(NODE root,int level)
{
  int i;
  if(root==NULL)return;
  display(root->rlink,level+1);
  for(i=0;i<level;i++)printf(" ");
  printf("%c\n",root->info);
  display(root->llink,level+1);
  
}
NODE create_tree(char postfix[])
{
  NODE temp,st[20];
  int i,k;
  char symbol;
  for(i=k=0;(symbol=postfix[i])!='\0';i++)
  {
    temp=getnode();
    temp->rlink=temp->llink=NULL;
    temp->info=symbol;
    if(isalnum(symbol))
    {
      st[k++]=temp;
      
    }
    else
    {
      temp->rlink=st[--k];
      temp->llink=st[--k];
      st[k++]=temp;
    }
  }
  return st[--k];
}
float eval(NODE root)
{
  float num;
  switch(root->info)
  {
    case '+':return eval(root->llink) + eval(root->rlink);
    case '-':return eval(root->llink) - eval(root->rlink);
    case '*':return eval(root->llink) * eval(root->rlink);
    case '/':return eval(root->llink) / eval(root->rlink);
    case '$':
    case '^':return pow(eval(root->llink),eval(root->rlink));
    default:
      if(isalpha(root->info))
      {
        printf("%c=",root->info);
        scanf("%f",&num);
        return num;
        
      }
      else
      {
        return root->info-'0';
      }
      
      

  }
}
int main()
{
  char postfix[40];
  float res;
  
  NODE root=NULL;
  printf("enter the postfix expression\n");
  scanf("%s",postfix);
  root=create_tree(postfix);
  printf("the expression tree is \n");
  display(root,1);
  res=eval(root);
  printf("result:%f\n",res);

}