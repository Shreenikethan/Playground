#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  cout<<"0.5"<<" ";
  float b=0.5;
  for(int i=1;i<n;i++)
  {
    b=b*3;
    cout<<b<<" ";
  }
}