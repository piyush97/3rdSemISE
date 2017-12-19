#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int top=-1,i=0,s[30];
int push(int el)
{
   s[++top]=el;
}
int pop()
{
   return s[top--];
}
void main()
{
char p[30],ch;
int op2,op1;
printf("Enter the postfix expression\n");
scanf("%s",p);
for(i=0;p[i]!='\0';i++)
{
ch=p[i];
if(isdigit(ch))
push(ch-48);
else
{
op2=pop();
op1=pop();
switch(ch)
{
case '+':push(op1+op2);break;
case '-':push(op1-op2);break;
case '*':push(op1*op2);break;
case '/':push(op1/op2);break;
case '^':push(pow(op1,op2));break;
if(op2==0)
printf("Divide by zero error");
else
push(op1/op2);
break;
}
}
}
printf("Answer is %d\n",s[top]);
}