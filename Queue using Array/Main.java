#include<iostream>
#include<cstdio>
using namespace std;
int queue[1000],front=-1,rear=-1; 
void enqueue(){ 
  int a; 
  scanf("%d",&a);
  if(front==-1 && rear==-1)
  { 
    front=rear=0; 
    queue[front]=a; 
  } 
  else
  {
    rear++; 
    queue[rear]=a; 
  } 
} 
void dequeue(){
  if((front==-1 || rear==-1)||front>rear)
    cout<<"Queue Underflow\n"; 
  else
  {
    cout<<"Element deleted from queue is : "<<queue[front]<<"\n"; 
    front++; 
  } 
}
void display()
{
  if(front==-1 && rear==-1)
    cout<<"Queue is empty\n"; 
  else
  {
    for(int i=front;i<=rear;i++)
      cout<<queue[i]<<" "; 
    cout<<"\n";
  } 
}
  
int main()
{
  //Type your code here 
  int choice; 
  while(scanf("%d",&choice)==1)
  {
    if(choice==1)
      enqueue(); 
    else if(choice==2)
      dequeue(); 
    else if(choice==3)
      display(); 
    else
      break; 
  }
  return 0;
}