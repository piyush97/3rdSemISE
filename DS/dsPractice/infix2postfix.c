#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<string.h>
char stack[40];
int top=-1;
void push(char x)
{
	stack[++top]=x;
	return;
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
	
}