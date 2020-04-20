#include<iostream>
#include<cstdio>
using namespace std; 
int stack[1000],top=-1; 
void push(int n){ 
  stack[++top]=n; 
} 
void pop(){ 
  if(top==-1) 
    cout<<"Stack is Empty!!! Deletion is not possible!!!\n"; 
  else 
    top--; 
} 
void display (){ 
  if(top==-1) 
    cout<<"Stack is Empty!!!\n" ;
  else 
  { 
    for(int i=top;i>=0;i--) 
      cout<<stack[i]<<"\n"; 
  } 
}
int main()
{
  //Type your code here  
  int query,a; 
  while(scanf("%d",&query)==1) 
  { 
    switch (query){
      case 1: 
        cin>>a; 
        push(a); 
        break; 
      case 2: 
         pop(); 
         break; 
      case 3: 
         display(); 
         break; 
      case 4: 
         return 0;  
    default: 
         cout<<"Wrong selection!!! Try again!!!"; 
         return 0; 
    }
  }
  return 0;
}