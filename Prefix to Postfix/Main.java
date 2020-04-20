#include<iostream>
#include<cstdio> 
#include<cstdlib> 
#include<string> 
using namespace std;
int main()
{
  //Type your code here 
  string stack[100]; 
  int top=-1;
  string s; 
  cin>>s;
  for(int i=s.length()-1;i>=0;i--){ 
    if(s[i]!='-' && s[i]!='*' && s[i]!='+' && s[i]!='/') { 
      string a(1,s[i]);
      stack[++top]=a; 
    } 
    else 
    { 
      string a=stack[top]; 
      string b=stack[top-1]; 
      string c(1,s[i]); 
      a=a+b+c; 
      top--; 
      stack[top]=a; 
    } 
  } 
  cout<<stack[top];
      
  
      
  return 0;
}