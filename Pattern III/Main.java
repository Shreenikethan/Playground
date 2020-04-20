#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  for(int i=1;i<=a;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(j<i)
      cout<<i<<"*";
      else
       cout<<i;
    }
    cout<<"\n";
  }
  for(int i=a;i>0;i--)
  {
    for(int j=1;j<=i;j++)
    {
      if(j==i)
        cout<<i;
      else
      cout<<i<<"*";
    }
    cout<<"\n";
  }
}