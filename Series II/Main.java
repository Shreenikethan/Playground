#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int b=11,c;
  for(int i=1;i<=n;i++)
  {
    c=b*b;
    cout<<c<<" ";
    b+=4;
  }
}