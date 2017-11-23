#include <stdio.h>

/**
 * Program to convert an infix expression to postfix.
 * Eg. ((a+b)*(d-e)) to ab+de-*
 * Demonstrates application of stacks
 **/

#define ST_SIZE 20

/** 
 * Function Prototypes
 */
void push ( char item, int *top, char * s);
char pop ( int *top, char * s);



/**
 * Function to return input precedence
 */
int G( char symbol )
{
	switch( symbol )
 	{
		case '+':
		case '-': return 1;
		case '*':
		case '/': return 3;
		case '$':
		case '^': return 6;
		case '(': return 9;
		case ')': return 0;
		default:  return 7;
	}
}


/**
 * Function to return stack precedence
 */
int F( char symbol )
{
	switch( symbol )
 	{
		case '+':
		case '-': return 2;
		case '*':
		case '/': return 4;
		case '$':
		case '^': return 5;
		case '(': return 0;
		case '#': return -1;
		default:  return 8;
	}
}


/**
 * Function to convert from infix to postfix
 */

void in2post( char* infix, char* postfix )
{
	int i,j,top = -1;
	char symbol;
	char stack[ST_SIZE];
	j = 0; // Stores the index for postfix string
	push('#',&top,stack);
	for(i = 0; infix[i]!='\0';i++)
	{
		symbol = infix[i];
		while( F(stack[top]) > G(symbol) ) // When the stack has higher precedence than input symbol, pop and add to postfix.
		{
			postfix[j++] = pop(&top,stack);
		}
		if( F(stack[top]) != G(symbol) )
		{
			push(symbol,&top,stack);		
		}
		else // Discard Matching Paranthesis
		{
			pop(&top,stack);
		}
	}
	while( stack[top] != '#' ) // pop and push to postfix
		postfix[j++] = pop(&top,stack);
	postfix[j] = '\0';
}	


/**
 * Stack operation - Push
 */

void push ( char item, int *top, char * s)
{
	if( *top == ST_SIZE - 1 )
	{
		printf("Stack Overflow");
		return;	
	}
	s[++(*top)] = item;
}

/**
 * Stack operation - Pop
 */

char pop ( int *top, char * s)
{
	if( *top == -1 )
	{
		printf("Stack underflow");
		return '\0';	
	}
	return s[(*top)--];
}




int main (  )
{
	char infix[20],postfix[20];
	printf("Enter infix expression: ");
	scanf("%s",infix);
	in2post(infix,postfix);
	printf("Postfix version is: %s\n\n",postfix);
	return 0;
}


