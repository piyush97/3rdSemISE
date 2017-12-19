#include<stdio.h>
#define stacksize 50
#include<math.h>
#include<stdlib.h>
#include<ctype.h>
struct stack
{
    int top;
    float items[50];
};

typedef struct stack STACK;
void push(STACK *s, float ele)
{
    if(s->top==stacksize-1)
        printf("stack is full\n");
    else
        s->items[++(s->top)]=ele;
}

int empty(STACK *s)
{
    return(s->top==-1);
}

float pop(STACK *s)
{
    return(s->items[s->top--]);
}

float evaluate(float op1, char op, float op2)
{
    switch(op)
    {
        case '+': return(op1+op2);
        case '-': return(op1-op2);
        case '/': return(op1/op2);
        case '*': return(op1*op2);
        case '^': return(pow(op1,op2));
        default: printf("Invalid\n");
        exit(0);
    }
}

void main()
{
    STACK opstk;
    char postfix[20], symb;
    int i=0;
    opstk.top=-1;
    float op1,op2,result;
    printf("Enter a postfix expression\n");
    gets(postfix);
    
    while((symb=postfix[i++])!='\0')
    {
        if(isdigit(symb))
            push(&opstk,((float)symb-'0'));
        else
        {
            if (empty(&opstk))
            {
                printf("Invalid\n");
                exit(0);
            }
            op2=pop(&opstk);
            
            if (empty(&opstk))
            {
                printf("Invalid\n");
                exit(0);
            }
            op1=pop(&opstk);
            result=evaluate(op1,symb,op2);
            push(&opstk,result);
        }
    }
    result=pop(&opstk);
    if (!empty(&opstk))
        printf("Invalid/Empty\n");
    else 
        printf("Result=%f\n",result);
}