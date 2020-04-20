#include<iostream>
#include<cstdlib>
#include<cstdio> 
#include<cstring>
using namespace std; 
int stack[1000],top=-1; 
int main(){
  // Type your code here 
  char s[5]; 
  while (scanf ("%s",s)==1) 
  { 
    if(atoi(s)) 
      stack[++top]=atoi(s); 
    else 
    { 
      int a=stack[top]; 
      int b=stack[top-1]; 
      top-=2; 
      if(strcmp(s,"+")==0) 
        stack[++top]=a+b; 
      else if(strcmp(s,"*")==0) 
        stack[++top]=a*b; 
      else if(strcmp(s,"/")==0) 
        stack[++top]=b/a; 
      else 
        stack[++top]=b-a; 
    }  
   
  } 
  cout<<stack[top];
  return 0;
}