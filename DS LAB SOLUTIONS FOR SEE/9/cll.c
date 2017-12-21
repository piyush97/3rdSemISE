#include<stdio.h>
#include<malloc.h>
struct node{
int info;
struct node *link;
};
struct node *last=NULL;
struct node *nn;
struct node *t,*t1,*t2;
void inbeg(int item);
void inend(int item);
void inp(int item,int p);
void delbeg();
void delend();
void delp(int p);
void display();
void main(){
int ch,n=1,item,p;
while(n>0)
{
printf("1.insert beg\n2.insert end\n3.insert at pos\n4.del at beg\n5.del end\n6.del pos\n7.display\n8.exit");
scanf("%d",&ch);
switch(ch){
case 1:printf("enter the item\n");
       scanf("%d",&item);
       inbeg(item);
break;
case 2:printf("enter the item\n");
scanf("%d",&item);
inend(item);
break;
case 3:printf("enter the item and pos\n");
scanf("%d%d",&item,&p);
inp(item,p);break;
case 4:delbeg();
break;
case 5:delend();
break;
case 6:printf("enter the  pos\n");
scanf("%d",&p);
delp(p);
break;
case 7:display();
break;
default:n=0;
}
}
}
void inbeg(int item){
nn = (struct node*)malloc(sizeof(struct node));
nn->info=item;
if(last==NULL){
nn->link=nn;
last=nn;
return;
}
nn->link=last->link;
last->link=nn;
}
void inend(int item){
nn = (struct node*)malloc(sizeof(struct node));
nn->info=item;
if(last==NULL){
nn->link=nn;
last = nn;
return;
}
nn->link=last->link;
last->link=nn;
last=nn;
}

void inp(int item,int p){
int c=1;
nn = (struct node*)malloc(sizeof(struct node));
nn->info=item;
if(last==NULL&&p==1){
nn->link=nn;
last=nn;
return;
}
if(last==NULL&&p>1){
printf("invalid pos");
return;
}
if(last->link==last&&p==1){
nn->link=last->link;
last->link=nn;
return;
}
if(last->link!=last&&p==1){
nn->link=last->link;
last->link=nn;
return;
}
t=last->link;
t1=last->link;
while(t->link!=t1 && c!=(p-1)){
t = t->link;
c++;
}
if(t==last){
nn->link=t->link;
t->link=nn;
last=nn;
return;
} 
nn->link=t->link;
t->link=nn;
}

void delbeg(){
if(last==NULL){
printf("empty");
return;
}
if(last->link==last){
free(last);
return;
}
t=last->link;
last->link=t->link;
free(t);
}

void delend(){
if(last==NULL){
printf("empty");
return;
}
if(last->link==last){
free(last);
last=NULL;
return;
}
t=last->link;
t1=last->link;
while(t->link->link!=t1){
t=t->link;
}
t2=last;
t->link=t1;
last=t;
free(t2);
}

void delp(int p){
int c=1;
if(last==NULL){
printf("empty");
return;
}
if(last==NULL&&p==1){
printf("empty\\");
}
if(last->link==last&&p==1){
free(last);
last=NULL;
return;
}

t=last->link;
while(t->link!=t&&c!=p){
t1=t;
t=t->link;
c++;
}
if(t==last){
last=t1;
t1->link=t->link;
free(t);
return;
}
if(last->link!=last&&p==1){
last->link=t->link;
free(t);
return;
}
t1->link=t->link;
free(t);
}
void display(){
if(last==NULL){
printf("empty");
return;
}
t=last->link;
while(t!=last){
printf("%d",t->info);
t=t->link;
}
printf("%d\n",t->info);
}
