#include <stdio.h>
#include <stdlib.h>
typedef  struct node
{
    int info;
    struct node *forw;
    struct node *back;
}NODE;
NODE *start=NULL;
NODE *curptr;
int pos1,pos2;
NODE *newnode;

void getnode()
{
    newnode=(NODE*)malloc(sizeof(NODE));
    printf("Enter the info\n");
    scanf("%d",&newnode->info);
}

void insert_beg()
{
    getnode();
    if(start==NULL)
    {
        start=newnode;
        newnode->forw=newnode->back=NULL;
    }

else
{
    newnode->forw=start;
    newnode->back=NULL;
    start->back=newnode;
    start=newnode;
}
}
void insert_end()
{
    if(start==NULL)
    {
        insert_beg();
    }
    else
    {
        curptr=start;
        while(curptr->forw!=NULL)
        {
            curptr=curptr->forw;
        }
        getnode();
        newnode->back=curptr;
        curptr->forw=newnode;
        newnode->forw=NULL;
    }
}
void delete_beg()
{
    curptr=start;
    if(isempty())
        {return;}
    else if(start->forw==NULL)
    {
        printf("the deleted element=%d\n",start->info );
        start=NULL;
        free(curptr);
    }
    else
    {
        printf("The deleted element=%d\n",start->info );
        start=start->forw;
        start->back=NULL;
        free(curptr);
    }
}
void display() 
{
    curptr=start;   
if(start==NULL)  
 {    
  printf("\nlist is empty"); 
  } 
else 
{ 
    while(curptr!=NULL) 
    { 
        printf("%d ",curptr->info); 
        curptr=curptr->forw; 
    } 
} 
}
int isempty()
{
    if(start==NULL)
    {
        printf("Empty\n");
        return 1;
    }
    return 0;
}

int main()
{
    int choice;
    while(choice!=5)
    {
        printf("enter 1 for insert_beg\n 2 for insert_end \n 3 for delete_beg \n 4. display");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:insert_beg();
            break;
            case 2:insert_end();
            break;
            case 3:delete_beg();
            break;
            case 4:
            display();
            break;
        }
    }
    return 0;
}