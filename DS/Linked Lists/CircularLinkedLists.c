#include <stdio.h>
#include <stdlib.h>
struct node{
int info;
struct node *link;
};
typedef struct node* NODE;
NODE insert_beg(int item,NODE last){

    NODE temp;
    temp=(NODE*)malloc(sizeof(NODE));
temp->info=item;
if(last==NULL){
    temp->link=temp;
return temp;
}
    else{
temp->link=last->link;
last->link=temp;
}
return last;
}
NODE insert_last(int item,NODE last){
    NODE temp,cur;
    temp=(NODE*)malloc(sizeof(NODE));
    temp->info=item;
if(last==NULL){
    temp->link=temp;
last=temp;
    return last;
}
 temp->link=last->link;
last->link=temp;
last=temp;
return last;
}
NODE insert_pos(int item,int pos,NODE last)
{
NODE temp,prev,cur;
temp=(NODE*)malloc(sizeof(NODE));
temp->info=item;

int count=1;
if(last==NULL && pos==1)
    {
temp->link=temp;
last=temp;
return last;
}
if(last==NULL && pos!=1)
{
    printf("\ninvalid position\n");
    return last;
}
if(pos==1)
{
    temp->link=last->link;
last->link=temp;
    return last;
}
prev=NULL;
cur=last->link;
while(count!=pos && cur!=last)
{
        prev=cur;
    cur=cur->link;
count++;
}
if(count==pos)
{
        prev->link=temp;
   temp->link=cur;
   return last;
}
printf("\ninvalid position\n");
return last;
}
NODE delete_beg(NODE last)
{
NODE temp;
if(last==NULL)
{
    printf("\nlist is empty\n");
    return last;}
if(last->link==last){
printf("\nitem deleted is=%d",last->info);
free(last);
return NULL;
}
temp=last->link;
printf("\ndeleted node is=%d",temp->info);
last->link=temp->link;
free(temp);
return last;
}
NODE delete_last(NODE last){
NODE prev=NULL;
if(last==NULL){
    printf("\nempty list");
    return last;
}
if(last->link==last){
printf("\ndeleted itm is=%d",last->info);
free(last);
return NULL;
}
prev=last->link;
while(prev->link!=last){

    prev=prev->link;
    }
prev->link=last->link;
last->link=NULL;
    printf("\ndeleted node is=%d",last->info);

   free(last);

return prev;

}
NODE delete_pos(NODE last,int pos){
NODE cur,prev;

if(last==NULL || pos<=0){
    printf("\ninvalid position\n");
    return NULL;
}
if(last->link==last && pos==1){
printf("\ndeleted item is=%d",last->info);
  free(last);
return NULL;
}
cur=last->link;
prev=last;
int count=1;
while(count!=pos && cur!=last){
    prev=cur;
    cur=cur->link;
    count++;
}

if(count==pos){
    prev->link=cur->link;

    if(cur==last){
        last=prev;
    }
     free(cur);
    return last;
}
else if(cur==last){
printf("\nposition not found\n");
        return last;
}
else{
printf("\nvalid position not found\n");
return last;
}
}
void display(NODE last){
    NODE temp;
if(last==NULL){
    printf("\nlinked list is empty\n");
    return;
}
    temp=last->link;
    while(temp!=last){

    printf("%d ",temp->info);
        temp=temp->link;
    }
printf("%d",last->info);

return;

}

int main(){
NODE last=NULL;
int ch,item,pos;
printf("\nWELCOME (circular) LINK LIST PROGRAM\n");
while(ch!=8){
    printf("enter the choice\n1:insert_front\n2:delete_front\n3:insert_last\n4:delete_last\n5:insert_position\n6:delete_position\n7:display\n");
    scanf("%d",&ch);
    switch(ch){
    case 1:printf("enter the element to insert\n");
    scanf("%d",&item);
    last=insert_beg(item,last);break;
    case 2:last=delete_beg(last);break;
    case 3:printf("enter the element\n");
    scanf("%d",&item);
    last=insert_last(item,last);break;
    case 4:last=delete_last(last);break;
    case 5:printf("enter the postion and elemnet\n");
    scanf("%d%d",&pos,&item);
    last=insert_pos(item,pos,last);break;
    case 6:printf("enter the position of elemnt\n");
    scanf("%d",&pos);
   last=delete_pos(last,pos);break;
    case 7:display(last);break;
    default:exit(0);
    }
}
return 0;
}