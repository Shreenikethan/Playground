#include<iostream>
using namespace std;
struct Node
{ int data;
  Node* next;
}*first,*last,*newnode,*temp;
int main(){
    // Type your code here
  int n,f=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {newnode=new Node();
   cin>>newnode->data;
   if(first==NULL)
   { first=last=newnode;}
   else{
     last->next=newnode;
     last=newnode;
   }
   last->next=NULL;
  }
  int x;
  cin>>x;
  temp=first;
  while(temp!=NULL)
  {  cout<<temp->data<<"-->";
   if(temp->data==x)
       f=1;  
    
     temp=temp->next;
  } cout<<"NULL\n";
  if(f==1)cout<<"Element Found";
  else cout<<"Element not found";
  return 0;
}