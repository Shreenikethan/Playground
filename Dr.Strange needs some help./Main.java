#include<iostream>
using namespace std;
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int mul=1;
  for(int i=1;i<=n;i++)
  {
    mul*=m;
  }
  if(req<=mul)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}