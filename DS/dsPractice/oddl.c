#include<stdio.h>
#include<malloc.h>
struct node{
int info;
struct node *l;
struct node *r;
};

struct node *nn;
struct node *s=NULL;
struct node *t;
void create(int item);
void dis();

void main()
{
	int c,n=1,item;
	while(n>0)
	{
	printf("1.create\n2.display\n");
	scanf("%d",&c);
	switch(c)
		{
		case 1:printf("enter the item\n");
		scanf("%d",&item);
		create(item);
		break;	
		case 2:dis();
		break;
		default:n=0;
		}
	}
}
void create(int item)
{
struct node *t;
nn = (struct node*)malloc(sizeof(struct node));
nn->info = item;
nn->l=nn->r=NULL;
if(s==NULL){
s=nn;
return;
}
t=s;
while(t->r!=NULL){
t=t->r;
}
while(t!=NULL){
if(t->info<=item){
nn->r=NULL;
t->r=nn;
nn->l=t;
return;
}
else{
t=t->l;
}
}
nn->r=s;
s->l=nn;
s=nn;
}
void dis(){
t=s;
while(t!=NULL){
printf("%d",t->info);
t=t->r;
}
}
