#include<iostream>
#include<cstdio> 
#include<cstdlib> 
#include<cstring>
using namespace std; 
int stack[1000],top=-1;
int main(){
  // Type your code here 
  char arr[100][100]; 
  int index=0; 
  while(scanf("%s",arr[index])==1) index++; 
  for(int i=index-1;i>=0;i--) 
  {  
    if(atoi(arr[i])) 
      stack[++top]=atoi(arr[i]); 
    else 
    { 
      int a=stack[top]; 
      int b=stack[top-1]; 
      top-=2; 
      if(strcmp(arr[i],"+")==0) 
        stack[++top]=a+b; 
      else if(strcmp(arr[i],"*")==0) 
        stack[++top]=a*b; 
      else if(strcmp(arr[i],"/")==0) 
        stack[++top]=a/b; 
      else 
        stack[++top]=a-b; 
    }  
   
  } 
cout<<stack[top];
  
  return 0;
}