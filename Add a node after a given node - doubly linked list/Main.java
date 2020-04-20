#include<iostream>
#include<cstdio>
using namespace std;
struct node{
  int data; 
  struct node*next; 
  struct node*prev;
}*first,*last,*temp,*newnode; 
void insert(int a)
{
  newnode=new node(); 
  newnode->data=a;
  if(first==NULL)
  first=last=newnode; 
  else
  {
    last->next=newnode; 
    newnode->prev=last;
    last=newnode; 
    newnode->next=NULL;
  } 
}
void traverse()
{
  temp=first; 
  while(temp)
  {
    cout<<temp->data<<"\n"; 
    temp=temp->next; 
  }
}
void insert(int p,int v)
{
  temp=first; 
  for(int i=1;i<p;i++)
    temp=temp->next; 
  newnode=new node(); 
  newnode->data=v; 
  newnode->next=temp->next; 
  temp->next=newnode;
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
  int position,val; 
  cin>>position>>val;
  cout<<"Before inserting:\n"; 
  traverse(); 
  cout<<"Enter the value and position\n"; 
  cout<<"After inserting:\n"; 
  insert(position,val); 
  traverse();
  
  return 0;
}