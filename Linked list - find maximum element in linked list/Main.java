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
  int max=-1; 
  temp=first; 
  while(temp!=NULL)
  {
    if(temp->data>max)
      max=temp->data;
    temp=temp->next; 
  }
  if(max>0)
  cout<<max;
  else
    cout<<0;
  return 0;
}