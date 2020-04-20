#include<iostream>
#include<cstdio>
using namespace std;
struct node{
  int data; 
  struct node*next; 
}*first,*last,*temp,*newnode; 
void insert(int a)
{
  newnode=new node(); 
  newnode->data=a;
  if(first==NULL){
  first=last=newnode;
  last->next=NULL;}
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
  int cnt=0;
  while(scanf("%d",&n)==1){
    if(n<1)
      break; 
    insert(n); 
    cnt++;
  }
  if(first==NULL) 
  { 
    cout<<"Deletion of second last element is not possible"; 
    return 0; 
  } 
  cout<<"Before deleting:\n"; 
  temp=first; 
  while(temp!=NULL)
  {
    cout<<temp->data<<" "; 
    temp=temp->next; 
  } 
  cout<<"\n";
 
  if(cnt<2){
    cout<<"Deletion of second last element is not possible\n";  
  }
  else
  {
    if(cnt==2) 
      first=last;
    else if(cnt==3) 
      first->next=first->next->next;
    else{
      temp=first;
    while(temp->next->next->next!=NULL)
      temp=temp->next; 
    temp->next=temp->next->next;
    }
   cout<<"After deleting:\n";
    
    temp=first;
    while(temp!=NULL)
    {
    cout<<temp->data<<" "; 
    temp=temp->next; 
    }
    }
  return 0;
}