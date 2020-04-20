#include<iostream>
using namespace std;
void print(int o)
{
  if(o==1)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}
int main()
{
  int n,m,p;
  cin>>n>>m;
  if(m%n==0 && n!=1)
    p=1;
  else
    p=0;
  print(p);
}