#include<iostream>
using namespace std;
struct node
{
 int data;
 node*prev;
 node*next;
}*newnode,*first,*last,*temp;
int main()
{
int n;
 cin>>n;
 first=NULL;
 for(int i=1;i<=n;i++)
 {
   newnode=new node();
   cin>>newnode->data;
   if(first==NULL){
     first=last=newnode;
   newnode->prev=NULL;
   }
   else
   {
     last->next=newnode;
     newnode->prev=last;
     last=newnode;
   }
 }
last->next=NULL;
 temp=first;
 while(temp!=NULL)
 {
   cout<<temp->data<<"-->";
   temp=temp->next;
 }
 cout<<"NULL";
 
}