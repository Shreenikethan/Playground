#include<iostream>
#include<queue>
#include<cstdio>
using namespace std;
int main()
{
  //type your code
  queue <int> myqueue; 
  int element;
  while(scanf("%d",&element)==1)
  {
    if(element<0)
      break; 
    myqueue.push(element); 
  } 
  if(myqueue.empty())
    cout<<"Queue is empty"; 
  else
  { 
    cout<<"Before reversing:\n"; 
    int arr[1000],c=0 ; 
    while(!myqueue.empty())
    {
      cout<<myqueue.front()<<" "; 
      arr[c++]=myqueue.front(); 
      myqueue.pop(); 
    }
    cout<<"\nAfter reversing:\n";
    for(int i=c-1;i>=0;i--)
      cout<<arr[i]<<" ";
  }
  
  return 0;
}