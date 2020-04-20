#include<iostream>
#include<cstring>
using namespace std; 
char stack[1000]; 
int top=-1;
void push(char c){ 
  top++; 
  stack[top]=c; 
} 
void pop(){top--;}
int main()
{
  //Type your code 
  char s[1000]; 
  cin>>s; 
  for (int i=0;i<strlen(s);i++) 
  {  
    if(strrchr("([{",s[i])) 
      push(s[i]); 
    else 
    { 
      if((s[i]==')'&&stack[top]=='(')||(s[i]=='}'&&stack[top]=='{')||(s[i]==']'&&stack[top]=='[')) 
        pop(); 
      else 
        push(s[i]); 
    } 
  }
  if(top!=-1) 
    cout<<"Not ";
    cout<<"Balanced";
  return 0;
}