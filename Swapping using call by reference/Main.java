#include<iostream>
using namespace std;
void swap(int,int);
void ref(int &x,int &y)
{
  int temp;
  temp=x;
  x=y;
  y=temp;
}
int main()
{
  int a,b,c;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  ref(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b<<"\n";
}