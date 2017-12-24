#include <stdio.h>
#include <string.h>
#include<ctype.h>
int top=-1,popped,i=0,k=0;
char a[20],postfix[20],stack[20],j;
void push(char b)
{
    top++;
    stack[top]=b;
}
int pop()
{
    popped=stack[top];
    top--;
    return popped;
}
int prec(char op)
{
    if(op=='^'||op=='$')
        return 3;
    else if(op=='*' || op=='/')
        return 2;
    else if(op=='+'|| op=='-')
        return 1;
        else
        return 0;
}
void infix_postfix(char infix[])
{
    for(i=0;infix[i]!='\0';i++)
    {
        if(isalnum(infix[i]))
            postfix[k++]=infix[i];
        else if(infix[i]=='(')
            push(infix[i]);
        else if(infix[i]==')')
        {
            while(stack[top]!='(')
            postfix[k++]=pop();
            j=pop();
        }
        else
        {
            if(stack[top]=='(' || top==-1)
                 push(infix[i]);
            else if(prec(stack[top])<prec(infix[i]))
                 push(infix[i]);
            else
            {
                while(top!=-1&&(prec(stack[top])>=prec(infix[i])))
                postfix[k++]=pop();
                push(infix[i]);
            }
        }
    }
    int i;
    for(i=top;i>=0;i--)
        postfix[k++]=pop();
    postfix[k]='\0';
    printf("\n%s",postfix);
}




void main()
{
printf("Enter the infix expression\n");
char a[20];
scanf("%s",a);
infix_postfix(a);
}