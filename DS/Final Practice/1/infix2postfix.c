//Infix to postfix using stack
#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#define size 40
char stack[size];
int top=-1;
void push(char a)
{
	stack[++top]=a;
}
char pop()
{
	if(top!=-1)
	return stack[top--];
	return -1;
}
int priority(char x)
{
	if(x=='(')
		return 0;
	if(x=='+'||x=='-')
		return 1;
	if(x=='*'||x=='/')
		return 2;
	if(x=='^'||x=='$')
		return 3;
}
int main()
{
	char expression[40];
	char x,*e;
	printf("Enter the infix expression\n");
	scanf("%s",expression);
	e=expression;
	while(*e!='\0')
	{
		if(isalnum(*e))
		{
			printf("%c", *e);
		}
		else if(*e=='(')
		{
			push(*e);
		}
		else if(*e==')')
		{
			while((x=pop())!='(')
			{
				printf("%c",x );
			}
		}
		else 
			{
				while(priority(stack[top])>priority(*e))
			printf("%c",pop());
		push(*e);
		
	}
		e++;
	}
	if(top!=-1)
	{
		printf("%c",pop() );
	}
	return 0;
} 