#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here 
  string s; 
  cin>>s; 
  string stack[1000]; 
  int top=-1;
  for(int i=0;i<s.length();i++) 
  { 
    if(isalnum(s[i])){ 
      top++; 
      string a(1,s[i]);
      stack[top]=a;
    } 
    else 
    { 
         string a=stack[top]; 
         string b=stack[top-1]; 
         string c(1,s[i]); 
         string d="("+b+c+a+")"; 
         top--; 
      stack[top]=d;
    }
    
  } 
  cout<<stack[top];
 
  
 return 0;
}