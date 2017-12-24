#include<stdio.h>
#define size 5
int lq[size],f=-1,r=-1;
void insert()
{
if(r==size-1)
printf("Queue is full\n");
else
{
if(r==-1)
f=r=0;
else
r++;
printf("Enter the element\n");
scanf("%d",&lq[r]);
}
return;
}
void delete()
{
if(f==-1)
printf("Queue is empty\n");
else
{
printf("Deleted element is %d\n",lq[f]);
if(f==r)
f=r=-1;
else
f++;
}
return;
}
void display()
{
int i;
if(r==-1)
printf("Queue is empty\n");
else
{
printf("Queue elements are\n");
for(i=f;i<=r;i++)
printf("%d ",lq[i]);
printf("\n");
}
return;
}
void main()
{
int ch;
while(ch!=4)
{
printf(" 1 INSERT\n 2 DELETE\n 3 DISPLAY\n 4 EXIT\n");
printf("Enter you choice\n");
scanf("%d",&ch);
switch(ch)
{
case 1:
insert();
break;
case 2:
delete();
break;
case 3:
display();
break;
case 4:
break;
}
}
}

