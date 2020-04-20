#include<iostream>
#include<cstdio>
using namespace std;
struct node{
  int data; 
  struct  node*next; 
}*front=NULL,*rear=NULL,*temp;
void enqueue(int x)
{
  temp= new node(); 
  temp->data=x; 
  if(rear==NULL)
  {
    front=rear=temp; 
  } 
  else
  {
    rear->next=temp; 
    rear=temp;
  }
} 
void display(){
  temp=front; 
  while(temp)
  {
    cout<<temp->data<<" "; 
    temp=temp->next; 
  }
}
int main()
{
  //type your code
  int element; 
  while(scanf("%d",&element)==1)
  {
    if(element<0)
      break; 
    enqueue(element);
  } 
  display();
  
  
  return 0;
}