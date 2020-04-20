#include<iostream> 
using namespace std; 
int queue[1000],front=-1,rear=-1; 
void push(int a){ 
  if(front==-1){ 
    front=rear=0; 
  } 
  else 
    rear++; 
  queue[rear]=a; 
}
int main() 
{
  //Type your code here 
  int n; 
  cin>>n;
  int element; 
  for(int i=0;i<n;i++) 
  { 
    cin>>element; 
    push(element);
  } 
  int k; 
  cin>>k;  
  int arr[1000],index=0;
for(int i=front+k-1;i>=front;i--){ 
  arr[index++]=queue[i];
} 
  for (int i=front+k;i<=rear;i++) 
    arr[index++]=queue[i]; 
  for(int i=0;i<index;i++) 
    cout<<arr[i]<<" ";
    
  
}