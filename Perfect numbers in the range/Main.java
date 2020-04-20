#include<iostream> 
using namespace std; 
int main() 
{ 
  int a,b; 
  cin>>a>>b; 
  for(int i=a+1;i<b;i++) 
  {  
    int s=0;
    for(int j=1;j<i;j++) 
    { 
      if(i%j==0) 
        s+=j; 
    } 
    if(s==i)
    cout<<s<<" "; 
  } 
}