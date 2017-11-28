#include<stdio.h>
#include<stdlib.h>

struct node
{
    int info;
    struct node *rlink;
    struct node *llink;
};

typedef struct node* NODE;

NODE getnode();
NODE insert_front(NODE , int);
NODE delete_front(NODE);
void display(NODE);

NODE insert_rear(NODE first, int item)
{

    NODE temp,cur;

    temp = getnode();
    temp->info = item;
    temp->rlink = NULL;
    temp->llink = NULL;
    
    if(first == NULL)
        return temp;

    cur = first;

    while(cur->rlink != NULL)
    {
        cur = cur->rlink;
    }

    cur->rlink = temp;
    temp->llink = cur;

    return first;

}

NODE delete_rear(NODE first)
{

    NODE cur, prev;

    if(first == NULL)
    {
        printf("List is empty\n");
        return first;
    }

    if(first->rlink == NULL)
    {
        printf("Item deleted is %d\n", first->info);
        free(first);

        return NULL;
    }

    cur = first;

    while(cur->rlink != NULL)
    {
        prev = cur;
        cur = cur->rlink;
    }

    prev->rlink = NULL;

    printf("Element deleted : %d\n", cur->info);

    free(cur);

    return first;
}

int main()
{
    NODE first;

    int item, choice;

    while(1)
    {
        printf("\n");
        printf("1. Insert front\n2.Insert Rear\n");
        printf("3. Delete front\n4.Delete Rear\n");
        printf("5. Display\n");
        printf("6. Exit\n");
        scanf("%d",&choice);
        
        switch(choice)
        {
            case 1:
                printf("Enter item to be inserted\t");
                scanf("%d", &item);
                
                first = insert_front(first, item);
                
                break;
            case 2:
                printf("Enter item to be inserted\t");
                scanf("%d", &item);
                
                first = insert_rear(first, item);
                
                break;
            case 4:
                first = delete_rear(first);
                
                break;  
                
            case 3:
                first = delete_front(first);
                
                break;
            
            case 5:
                display(first);

                        break;

            default:
                exit(0);
        }
    }
}

NODE getnode()
{

    NODE x;

    x = (NODE) malloc(sizeof(struct node));

    if(x == NULL)
    {
        printf("Unable to create node\n");
        return 0;
    }

    return x;

}


NODE insert_front(NODE first, int item)
{

    NODE temp;

    temp = getnode();
    temp->info = item;
    temp->llink = NULL;
    
    if(first == NULL)
        return temp;    

    temp->rlink = first;
    first->llink = temp;

    return temp;
}

NODE delete_front(NODE first)
{

    NODE next;

    if(first == NULL)
    {
        printf("List is empty\n");
        return first;
    }

    if(first->rlink == NULL && first->llink == NULL)
    {
        printf("Deleted item is: %d\n", first->info);
        free(first);
        return NULL;
    }

    next = first->rlink;

    printf("Deleted item is: %d\n",first->info);

    free(first);
    return next;

}

void display(NODE first)
{
    NODE temp;
    
    if(first == NULL)
        {
            printf("List is empty\n");
            return;
        }

    printf("Contents of linked list:\n");

    temp = first;

    while(temp != NULL)
    {
        printf("%d\n", temp->info);
        temp = temp->rlink;
    }
}
