#include<stdio.h>
#include<stdlib.h>
struct node{
int info;
struct node *l;
struct node *r;
};
struct node *s=NULL;
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
nn->l=NULL;
if(s==NULL){
nn->r=NULL;
s=nn;
return;
}
nn->r=s;
s->l=nn;
s=nn; 
}
void inend(int item){
nn = (struct node*)malloc(sizeof(struct node));
nn->info=item;
nn->r=NULL;
if(s==NULL){
nn->l=NULL;
s=nn;
return;
}
t=s;
while(t->r!=NULL){
t=t->r;
}
t->r=nn;
nn->l=t;
}
void delbeg(){
if(s==NULL){
printf("empty\n");
return;
}
if(s->r==NULL){
free(s);
s=NULL;
return;
}
s=s->r;
free(s->l);
s->l=NULL;
}
void delend(){
if(s==NULL){
printf("emty");
return;
}
if(s->r==NULL){
free(s);
s=NULL;
return;
}
t=s;
while(t->r->r!=NULL){
t=t->r;
}
free(t->r);
t->r=NULL;
}
void display(){
if(s==NULL){
printf("emty");
return;
}
t=s;
while(t!=NULL){
printf("%d\t",t->info);
t=t->r;
}
}
void inp(int item,int p){
int c=1;
nn = (struct node*)malloc(sizeof(struct node));
nn->info=item;
nn->l=NULL;
if(s==NULL&&p==1){
nn->r=NULL;
s=nn;
return;
}
if(s!=NULL&&p==1){
nn->r=s;
s->l=nn;
s=nn;
return;
}
t=s;
t1=s;
while(t!=NULL&&c!=(p)){
t1=t;
t=t->r;
c++;
}
if(t==NULL&&t1->r==NULL){
nn->r=NULL;
t1->r=nn;
nn->l=t1;
return;
}
nn->r=t1->r;
t1->r=nn;
t->l=nn;
nn->l=t1;
}
void delp(int p){
int c=1;
if(s==NULL){
printf("emty");
return;
}
if(s->r==NULL&&p==1){
free(s);
return;
}
t=s;
while(t!=NULL&&c!=(p-1)){
t=t->r;
c++;
}
if(t->r->r==NULL){
free(t->r);
t->r=NULL;
return;
}
t1=t->r;
t2=t->r->r;
t->r=t1->r;
t2->l=t1->l;
free(t1);
}
