#include<iostream>
#include<cstdio>
using namespace std;
struct node{
  int data; 
  struct node*next;
}*first,*last,*temp,*newnode,*temp1; 
void insert(int a)
{
  newnode=new node(); 
  newnode->data=a;
  if(first==NULL)
  first=last=newnode; 
  else
  {
    last->next=newnode; 
  
    last=newnode; 
    
  } 
}
void traverse()
{
  temp=first; 
  while(temp!=NULL)
  {
    cout<<temp->data<<"\n"; 
    temp=temp->next; 
  } 
}
int found(node *t)
{
  temp1=first; 
  if(t==NULL)
    return 0;
  while (temp1!=NULL && temp1!=t) 
  { 
    if(temp1->data==t->data) 
      return 1; 
    temp1=temp1->next;
  } 
  return 0;
}
void removeduplicates()
{
  temp=first; 
  while(temp!=NULL)
  {
    int p=1;
    if(found(temp->next)){
      if(temp->next->next!=NULL){
      temp->next=temp->next->next; 
        p=0;}
      else {
        delete(temp->next);
        temp->next=NULL;
      }
    }
    if(p)
      temp=temp->next;
  } 
}

int main()
{
  //type your code here
  int n; 
  first=NULL;
  while(scanf("%d",&n)==1){
    if(n<0)
      break; 
   insert(n); 
  }
  cout<<"Linked list before removal of duplicates\n";
  traverse();
  cout<<"Linked list after removal of duplicates\n"; 
  removeduplicates();
  traverse();
  
  return 0;
}