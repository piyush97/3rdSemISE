#include<stdio.h>
#include<stdlib.h>
typedef struct NODE
{
  int info;
  struct NODE *back;
  struct NODE *forward;
}*start=NULL;
  NODE *newnode;
void insert_beg(int item)
{
  newnode=(struct NODE*) malloc(sizeof(struct node));
  newnode->info=item;
  if(start==NULL)
  {
    start=newnode;
    newnode->forward=newnode->back=NULL;
  }
  else
  {
    newnode->forward=start;
    newnode->back=NULL;
    start->back=newnode;
    start=newnode;

  }
}
