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
    last->next=NULL;
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
  temp=first; 
  int max=0;
  while(temp!=NULL)
  {
    temp1=temp->next;
    while(temp1!=NULL)
    {
      if(temp!=temp1)
      {
        int a=temp1->data+temp->data; 
        if(a>max)
          max=a; 
      } 
      temp1=temp1->next; 
    } 
    temp=temp->next; 
  } 
  cout<<max;
  
  return 0;
}