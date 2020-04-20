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
  int cnt=0;
  while(scanf("%d",&n)==1){
    if(n<0)
      break; 
    insert(n); 
    cnt++;
  }
  int a; 
  cin>>a; 
  cout<<"Enter the nth node:\n";
  if(a>cnt)
    cout<<"There is no nth node in the list"; 
  else 
  {
    temp=last; 
    a--;
    while(a>0)
    {
      temp=temp->prev; 
      a--;
    } 
    cout<<temp->data<<" is the nth node element in the list";
  }
  
  return 0;
}