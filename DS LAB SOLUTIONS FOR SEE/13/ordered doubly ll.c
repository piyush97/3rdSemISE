#include<stdio.h>
#include<stdlib.h>

struct node
{
    int info;
    struct node *left;
    struct node *right;
};
typedef struct node* NODE;
NODE start=NULL;
void insert_order(int item)
{
    NODE cur,prev,nn;
    nn=(NODE)malloc(sizeof(struct node));
    nn->info = item;
    nn->left = NULL;
    nn->right = NULL;
if(start==NULL)
{
    start=nn;
    return;
}
else if(item<=start->info)
{
nn->right=start;
start->left=nn;
start=nn;
return;
}
prev=NULL;
cur=start;
while(cur!=NULL && item>cur->info)
{
prev=cur;
cur=cur->right;
}
if(cur!=NULL)
{
nn->right=prev->right;
prev->right=nn;
nn->left=prev;
cur->left=nn;
}
else
{
    prev->right=nn;
    nn->left=prev;
}
return;
}
void disp()
{
NODE cur;
if(start==NULL)
printf("empty\n");
else
{
cur=start;
while(cur!=NULL)
{
printf("%d ",cur->info);
cur=cur->right;
}
}
}
void delete()
{
	struct node* temp;
	if(start==NULL)
	{
		printf("LL IS EMPTY\n");
		return;
	}
	temp=start;
	printf("%d is delted\n",start->info );
	start=start->right;
	free(temp);
	return;
}
int main()
{
int ch,item;
while(ch!=4)
{
printf("enter choice\n1:Insert\n2:Display\n3:DELETE\n4:exit");
scanf("%d",&ch);
switch(ch)
{
case 1:printf("enter element\n");
scanf("%d",&item);
insert_order(item);
break;
case 2:disp();
break;
case 3:
delete();
break;
}
}
return 0;
}