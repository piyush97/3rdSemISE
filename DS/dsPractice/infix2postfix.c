#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<string.h>
char stack[40];
int top=-1;
void push(char x)
{
	stack[++top]=x;
}
char pop()
{
	if(top=-1)
		return -1;
	return stack[top--];
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
	char *e,x;
	printf("Enter the expression please\n");
	scanf("%s",expression);
	e=expression;
	while(*e!='\0')
	{	
		if(isalnum(*e))
			printf("%c",*e);
			else if(*e=='(')
				push(*e);
			else if(*e==')')
			{
				while(x=pop()!='(')
					printf("%c", x);
			}





		e++;
	}
}