#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  for(int i=1;i<=4;i++)
  { 
    for(int j=1;j<=i;j++)
    {
      cout<<a;
    }
    a+=1;
    cout<<"\n";
  }
  a-=1;
  for(int i=4;i>0;i--)
  {
    for(int j=1;j<=i;j++)
    {
      cout<<a;
    }
    a-=1;
    cout<<"\n";
  }
      
}