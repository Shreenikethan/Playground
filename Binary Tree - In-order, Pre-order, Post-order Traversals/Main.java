#include<iostream>
#include<cstdio>
using namespace std; 
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
void inorder_traverse(struct node *t)
{ 
  if(t!=NULL)
  {
    inorder_traverse(t->left); 
    cout<<t->data<<" "; 
    inorder_traverse(t->right);
  }
   
}
void preorder_traverse(struct node*t)
{
  if(t!=NULL)
  {
    cout<<t->data<<" ";
    preorder_traverse(t->left); 
    preorder_traverse(t->right); 
  } 
}
void postorder_traverse(struct node*t)
{
  if(t!=NULL)
  {
    postorder_traverse(t->left); 
    postorder_traverse(t->right); 
    cout<<t->data<<" "; 
  }
}
int main()
{
  //Type your code here  
  int n; 
  cin>>n; 
  for(int i=0;i<n;i++)
  {
    int e; 
    cin>>e; 
    insert(root,e); 
  }
cout<<"In-Order Traversal: ";inorder_traverse(root);cout<<"\n"; 
  cout<<"Pre-Order Traversal: ";preorder_traverse(root);cout<<"\n";
  cout<<"Post-Order Traversal: ";postorder_traverse(root);
  
}