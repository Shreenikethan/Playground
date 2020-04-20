#include<iostream>
using namespace std;
struct Node
{ int data;
  Node* next;
}*first,*last,*newnode,*temp;
int main(){
  int n,f;
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
  cout<<"Before deletion:"<<endl;
  temp=first;
  while(temp!=0)
  {
    cout<<temp->data<<"-->";
    temp=temp->next;
  }
  cout<<"NULL"<<endl;
  cout<<"After deletion:"<<endl;
  cin>>f;
  temp=first;
  while(temp!=NULL)
  {
    if(temp->data!=f)
    cout<<temp->data<<"-->";
    temp=temp->next;
  }
  cout<<"NULL"<<endl;
  
}  