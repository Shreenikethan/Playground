#include<iostream>
using namespace std;
struct Node
{ int data;
  Node* next;
}*first,*last,*newnode,*temp,*prev;
int main(){
  int n;
  cout<<"Original order:\n";
  while((cin>>n))
  {
    if(n<0)
      break;
    newnode=new Node();
    
   newnode->data=n;
    cout<<n<<endl;
   if(first==NULL)
   { first=last=newnode;
   last->next=NULL;}
   else{
     newnode->next=first;
     first=newnode;
   }
  }
 
  cout<<"Reverse order:"<<endl;
  temp=first;
  while(temp!=NULL)
  {
    cout<<temp->data;
    temp=temp->next;
    cout<<endl;
  }
}