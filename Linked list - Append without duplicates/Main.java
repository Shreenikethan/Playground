#include<iostream>
using namespace std;
struct Node
{ int data;
  Node* next;
}*first,*last,*newnode,*temp,*temp1;
int main(){
  int n,f=1;
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
     temp=first;
     while(temp!=NULL)
     {
       if(temp->data==n)
       {
         f=0;
         break;
       }
       temp=temp->next;
     }
     if(f==1){
       last->next=newnode;
       last=newnode;}
  }
   }
  temp=first;
  while(temp!=NULL)
  {
      cout<<temp->data<<"\n";
    	temp=temp->next;
  }
  return 0;
}