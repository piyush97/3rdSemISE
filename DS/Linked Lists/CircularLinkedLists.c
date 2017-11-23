#include <stdio.h>
#include <stdlib.h>

/**
 *  Self Referential Structure
 *  Members:
 *    -info - holds data
 *    -link - Self referential pointer
 */
typedef struct node
{
	int info;
	struct node * link;
} node;

typedef node* NODE;


/**
 *  Allocates memory dynamically on heap, of size equivalent to size of node structure
 *  @params none
 *  @returns NODE (pointer to type struct node)
 */
NODE getnode()
{
	NODE x;
	// Allocate memory on heap for size of node structure
	x= (NODE) malloc(sizeof(node));
	// Display a message incase of allocation failure
	if(x==NULL)printf("Node creation failure!\n");
	// Return a pointer to the newly created node
	return x;
}

/**
 *  Prints data stored in node passed as parameter
 *  De allocates memory dynamically on heap, of size equivalent to size of node structure
 *  @params temp (pointer to node)
 *  @returns none
 */
void freenode(NODE temp)
{
	// Display contents of node to be deleted
	printf("Deleting %d\n",temp->info);
	// Deallocate memory for the node
	free(temp);
}

/**
 *  Inserts a node at the begining of the list
 *  @params item (integer) , last (Pointer to last node)
 *  @returns NODE (pointer to last node)
 */
NODE insert_front(int item, NODE last)
{
	NODE temp;
	// Allocate Memory for new node and set contents to data given by user
	temp = getnode();
	temp->info = item;
	// If list is empty, return pointer to new node as last
	if(last == NULL)
	{
		temp->link = temp;
		return temp;
	}
	// Make the new node's link point to the current first node
	temp->link = last->link;
	// Make the last node's link point to newly created node
	last->link = temp;
	// Return the last node
	return last;
}

/**
 *  Deletes a node at the begining of the list
 *  @params  last (Pointer to last node)
 *  @returns NODE (pointer to last node)
 */
NODE delete_front(NODE last)
{
	NODE temp;
	// If list is empty print a message and exit function
	if(last == NULL)
	{
		printf("List Empty!\n");
		return NULL;
	}
	//Otherwise if only one node exists, delete the node and exit the function
	else if(last->link == last) 
	{
		freenode(last);
		return NULL;
	}
	else
	{
		// Get the first node
		temp= last->link;
		// Set the last node's link to the 2nd node
		last->link = temp->link;
		// Delete the first node and return the last node
		temp->link = NULL;
		freenode(temp);
		return last;	
	}
}

/**
 *  Inserts a node at the end of the list
 *  @params item (integer) , last (Pointer to last node)
 *  @returns NODE (pointer to last node)
 */
NODE  insert_rear(int item, NODE last)
{
	NODE temp;
	// Allocate Memory for new node and set contents to data given by user
	temp = getnode();
	temp->info = item;
	// If list is empty, return pointer to new node as last
	if(last == NULL)
	{
		temp->link = temp;
		return temp;
	}
	// Set the link of new node to the first node
	temp->link = last->link;
	// Set the last node's link to new node and make it the last node
	last->link = temp;
	last = temp;
	// Return the last node
	return last;
}

/**
 *  Deletes a node at the end of the list
 *  @params  last (Pointer to last node)
 *  @returns NODE (pointer to last node)
 */
NODE delete_rear(NODE last)
{
	NODE prev,cur;
	
	if(last == NULL)
	{
		printf("List Empty!\n");
		return NULL;
	}
	else if(last->link == last)
	{
		freenode(last);
		return NULL;
	}
	else
	{
		prev = last;
		cur = last->link;
		while(cur!=last)
		{
			prev= cur;
			cur = cur->link;
		}	
		prev->link = cur->link;
		cur->link = NULL;
		freenode(cur);
		last = prev;
		return last;
	}
}

/**
 *  Inserts a node at a given position in the list
 *  @params last (Pointer to last node),item (integer),pos (integer) 
 *  @returns NODE (pointer to last node)
 */
NODE insert_pos( NODE last, int pos, int item)
{
	int count =1;
 	NODE prev, cur, temp;
 	if(pos<1) return last;
 	temp = getnode();
 	temp->info = item;
 	if(last == NULL)// List is empty
 	{
 		temp->link = temp;
 		return temp;
 	}
 	if(pos == 1) //insert front
 	{
 		temp->link = last->link;
 		last->link = temp;
 		return last;
 	}
 	prev = NULL; cur = last->link;
 	while(pos!=count && prev!=last)
 	{
 		prev = cur;
 		cur=cur->link;
 		count++;
 	}
 	if(pos == count)
 	{
 		prev->link = temp;
 		temp->link = cur;
 		if(prev == last)
 			last = temp;
 		return last;
 		
 	}
 	printf("Invalid Position!\n");
 	return last;
}


/**
 *  Deletes a node at a given position in the list
 *  @params last (Pointer to last node),pos (integer) 
 *  @returns NODE (pointer to last node)
 */
NODE delete_pos(NODE last, int pos)
{
	NODE cur,prev;
	int count =1;
	if(last == NULL)
	{
		printf("List Empty\n");
		return last;
	}
	if(pos == 1)
	{
		cur = last->link;
		last->link = cur->link;
		freenode(cur);
		if(last->link == last) 
			return NULL;
		return last;
	}
	prev = NULL;
	cur = last->link;
	while(prev!=last && count!=pos)
	{
		prev= cur;
		cur= cur->link;
		count++;
	}
	if(prev == last && count!=pos)
	{
		printf("Invalid position!\n");
		return last;
	}
	if(count == pos)
	{
		prev->link = cur->link;
		if(cur== last)
			last = prev;
		freenode(cur);
	}
	return last;
	
}


/**
 *  Displays all elements in the list by traversing through entire list
 *  @params last (Pointer to last node)
 *  @returns none
 */
void display(NODE last)
{
	NODE temp;
	if(last == NULL)
	{
		printf("List Empty!\n");
		return;
	}
	temp = last->link;
	while(temp!=last)
	{
	  printf("%d -> ", temp->info);
	  temp=temp->link;
	}
	printf("%d\n",last->info);
}

int main()
{
	NODE last = NULL;
	int data,ch,key,pos;
	do
	{
		printf("1. Insert at front of list\n");		
		printf("2. Insert at end of list\n");
		printf("3. Delete first element\n");
		printf("4. Delete last element\n");
		printf("5. Display the list\n");
		printf("6. Insert at a position\n");	
		printf("7. Delete at position\n");
		printf("8. Exit\n");
		printf("Enter your choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			default:
				break;
			case 1: 
				printf("Enter element to insert at front:");
				scanf("%d",&data);
				last = insert_front(data,last);
				break;
			case 2: 
				printf("Enter element to insert at end:");
				scanf("%d",&data);
				last = insert_rear(data,last);
				break;
			case 3: 
				last = delete_front(last);
				break;
			case 4:
				last = delete_rear(last);
				break;
			case 5:
				printf("The list contains:\n");
				display(last);
				break;	
			case 6: 
				printf("Enter position to insert:");
				scanf("%d",&pos);
				printf("Enter element to insert at position:");
				scanf("%d",&data);
				last = insert_pos(last,pos,data);
				break;
			case 7: 
				printf("Enter position to delete:");
				scanf("%d",&pos);
				last = delete_pos(last,pos);
				break;
		}
	}while(ch!=8);
	return 0;
}
