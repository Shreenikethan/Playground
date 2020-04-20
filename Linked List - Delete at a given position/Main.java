#include<iostream>
using namespace std;
struct Node
{ 
	int data; 
	Node* next; 
}*newnode, *first, *last, *temp;
void insertion(int n)
{
	for(int i = 0; i < n; i++){
    	newnode = new Node();
    	cin>>newnode->data;
		if(first == NULL)
		{
	    	first = last = newnode;
		}
		else
		{
	    	last->next = newnode;
        	last=newnode;
		}
		last->next = NULL;
	}
}
int deletion(int n)
{
    int pos;
  while(cin>>pos){
 //pos-=1;
    if(pos==1)
    {first=first->next;
     break;}
    else if(pos>n)cout<<"Please enter the correct position\n";
     temp=first;
      while(pos--)
    { if(pos==1)
    {  if(temp==NULL)
      cout<<"Please enter the correct position\n";
      else if(temp->next==NULL)
      {Node *t=temp->next;
       temp->next=NULL;delete(t);n-=1;}
     else{Node *t=temp->next;
       temp->next=temp->next->next;
          delete(t);n-=1;
     }
    }else if(temp==NULL) {
      cout<<"Please enter the correct position\n";}
     else
     { temp=temp->next;}
    }
  }
}
void display()
{
    temp = first;
    if(temp==NULL)
    {
        cout<<"No elements to display"<<endl;
    }
    else
    {
    	while(temp != NULL)
    	{
    	    cout<<temp->data<<"-->";
    	    temp=temp->next;
    	}
    	cout<<"NULL\n";
    }
}

int main() { 
  int n;
  cin>>n;
  insertion(n);
  display();
  deletion(n);
  display();
  return 0; 
}