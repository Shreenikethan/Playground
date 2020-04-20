#include<iostream>
using namespace std;
struct Node
{ int data;
  Node* next;
}*first,*last,*newnode,*temp;
int main(){
  int n;
  while((cin>>n))
  {
    if(n<0)
      break;
    newnode=new Node();
   newnode->data=n;
   if(first==NULL)
   { first=last=newnode;
   last->next=NULL;}
   else{
     newnode->next=first;
     first=newnode;
   }
  }
  temp=first;
  if(temp->next==NULL )
  {
    cout<<"There is no second last element in the list";
 }
   else
   {
     cout<<temp->next->data<<" is the second last element in the list";
   }
    
}