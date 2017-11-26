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
NODE insert(NODE , int);
NODE rem(NODE, int);
void display(NODE);



int main()
{
	NODE first= NULL;

	int item, choice;

	while(1)
	{
		printf("\n");
		printf("1. Insert an element");
		printf("\n2. Delete an element");
		printf("\n3. Display\n");
		printf("4. Exit\n");
		scanf("%d",&choice);
		
		switch(choice)
		{
			case 1:
				printf("Enter item to be inserted: ");
				scanf("%d", &item);
				first = insert(first, item);
				break;
			case 2:
				printf("Enter item to be deleted: ");
				scanf("%d", &item);
				first = rem(first, item);		
				break;
			case 3:
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
	}

	return x;

}


NODE insert(NODE first, int item)
{

	/* create temp Node p then point to head to start traversing */
    NODE temp = getnode();
    temp->info = item;

    /* if the first element */
    if ( first == NULL) {
        temp->llink = NULL;
        temp->rlink = NULL;
        return temp;
    }
    /* if inserting into begining */
    else if ( temp->info < first->info ) {
        temp->rlink = first;
        first->llink = temp;
        temp->llink = NULL;
        first = temp;
        return temp;
    }

    else {
        temp->rlink = first;
        int found = 0;
        /* find if there is a number bigger than passed val */
        while((temp->rlink != NULL) && ( found == 0)) {
            if(temp->info < temp->rlink->info)
             {   
             	found = 1;
             	break;
             }
            else {
            	temp->llink = temp->rlink;
                temp->rlink = temp->rlink->rlink;
            }
        }
        /* if in the middle of the list */
        if(found == 1)
        {
            NODE next = temp->rlink;
            temp->llink = next->llink;
            next->llink->rlink = temp;
            temp->rlink = next;
            next->llink = temp;
        }
        /* if last node */
        else {
            NODE last =temp->llink;
            last->rlink = temp;
            temp->llink=last;
        }
        return first;
    }
}

NODE rem(NODE first, int key)
{	
	NODE temp, temp2, temp3;
	if(first== NULL) { printf("List Empty!"); return NULL;}	
	temp = first;
	if(temp->info == key)//deleting the first node if matches
	{
	 	first = temp->rlink;
	 	first->llink = NULL;
	 	printf("\nDeleting %d", temp->info);
	 	free(temp);
	 	return first;
	}
	while(temp!=NULL)
	{	
		if(temp->info == key)
		{
			temp2 = temp->llink;
			temp3 = temp->rlink;
			temp2->rlink = temp3;
			if(temp3!=NULL) temp3->llink = temp2;
			printf("Deleting %d", temp->info);
	 		free(temp);
	 		temp = temp3;

		}
		if(temp!= NULL) //Ensure that there is a node to move forward to.
		{
		 temp = temp->rlink;
		}
	}
	return first;
	
}


void display(NODE first)
{
	NODE temp;
	
	if(first == NULL)
		printf("List is empty\n");

	printf("Contents of linked list:\n");

	temp = first;

	while(temp != NULL)
	{
		printf("%d\n", temp->info);
		temp = temp->rlink;
	}
}
