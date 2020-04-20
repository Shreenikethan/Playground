#include<iostream>
using namespace std;
int main()
{
  int a,c=1;
  cin>>a;
  int n=a;
  int s=a*a;
  while(a>0)
  {
    c*=10;
    a/=10;
  }
  int a1,b1;
  a1=s/c;
  b1=s%c;
  int t=a1+b1;
  if(t==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}