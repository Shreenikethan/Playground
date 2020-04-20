#include<iostream>
using namespace std;
int queue[10000000],front=-1,rear=-1;
int main()
{
  //Type your code
  int n; 
  cin>>n;
   for(int i=0;i<n;i++)
   {
     if(front==-1 && rear==-1)
       front=rear=0; 
     else
       rear++; 
     cin>>queue[rear]; 
   } 
  for(int i=front;i<=rear;i++){ 
    if(front!=-1)
    cout<<queue[i]<<" ";}
  return 0;
}