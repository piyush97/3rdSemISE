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
NODE *newnode;//deckaring it in global for easy access

void getnode() //to enter the data in node
{
    newnode=(NODE*)malloc(sizeof(NODE));
    printf("Enter the info\n");
    scanf("%d",&newnode->info);
}

void insert_beg() //inserting data in the begining/start
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
        while(curptr->forw==NULL)
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
void insert_pos()
{
    printf("enter position\n");
    scanf("%d",&pos1);
    if(pos1==1)
    {
        insert_beg();
        return;
    }
    else
    {
        curptr=start;
        for(int i=0;i<pos1-2;i++)
        {
            curptr=curptr->forw;
        }
        getnode();
        newnode->back=curptr;
        newnode->forw=curptr->forw;
        curptr->forw->back=newnode;
        curptr->forw=newnode;
    }
}
void delete_end()
{
    curptr=start;
    if(isempty())
    {
        return;
    }
    else
        if(start->forw==NULL)
        {
            delete_beg();
        }
        else
        {
            while(curptr->forw!=NULL)
            {
                curptr=curptr->forw;
            }
            printf("the element deleted is %d\n", curptr->info);
            curptr->back->forw=NULL;
            free(curptr);
        }
}
void delete_pos()
{
    if(isempty())
    {
        return;
    }
    else
    {
        printf("enter position\n");
        scanf("%d",&pos2);
        if(pos2==1)
        {
            delete_beg();
            return;
        }
        else
        {
            curptr=start;
            for(int j=1;j<pos2;j++)
            {
                curptr=curptr->forw;
            }
            printf("The deleted element is %d\n",curptr->info );
            if(curptr->forw==NULL)
            {
                curptr->back->forw=NULL;
            }
            else
            {
                curptr->back->forw=curptr->forw;
                curptr->forw->back=curptr->back;
            }
            free(curptr);
        }
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


//move
/*
void move()
{
    curptr=start;
    int pos,element;
    printf("Enter the element you want to move\n");
    scanf("%d",&element);
    if(isempty())
       {
        printf("Linked list is empty\n");
        return;
       } 
       else{while(curptr!=NULL)
        {
            if(curptr->info=element)
            {
                printf("Enter the number of positions you want to make it forward\n");
                scanf("%d",&pos);

                for(int i=0;i==pos && curptr->link!=NULL;i++)
                {
                    curptr->link
                }
            }
                    curptr=curptr->forw; 


        }

       }

}*/
int main()
{
    int choice;
    while(choice!=8)
    {
        printf("\n 1. insert_beg\n2.insert_end\n3.insert_pos\n4.delete_beg\n5.delete_end\n6.delete_pos\n7.display\n8.EXIT");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:insert_beg();
            break;
            case 2:insert_end();
            break;
            case 3:insert_pos();
            break;
            case 4:delete_beg();
            break;
            case 5:delete_end();
            break;
            case 6:delete_pos();
            break;
            case 7:display();
            break;
           /* case 8:move();
            break;*/
        }
    }
    return 0;
}
