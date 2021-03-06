#include<iostream>
#include<cstdio>
using namespace std; 
int sum=0;
struct node{
  int data; 
  struct node*left; 
  struct node*right; 
} *root=NULL;
struct node*createnode(int element)
{
  struct node*newnode=new node(); 
  newnode->data=element; 
  newnode->left=newnode->right=NULL; 
  return newnode;
} 
void insert(struct node *t,int x)
{
  if(root==NULL)
  {
    root=createnode(x); 
  } 
  else if(x<t->data)
  { 
    if(t->left!=NULL)
    insert(t->left,x);  
    else
      t->left=createnode(x); 
  }
  else
    { 
    if(t->right!=NULL)
    insert(t->right,x);  
    else
      t->right=createnode(x); 
  }
} 
void traverse(struct node *t)
{ 
  if(t!=NULL)
  {
    traverse(t->left); 
    sum+=t->data;
    traverse(t->right);
  }
   
}
int main()
{
  //Type your code here  
  int choise; 
  while(scanf("%d",&choise)==1)
  {
    if(choise>=0)
     insert(root,choise);
    else
      break; 
  } 
  traverse(root); 
  cout<<"Sum of all nodes are "<<sum;

  
}