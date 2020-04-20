#include<iostream>
using namespace std;
int main()
{
  int n,x,c;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cin>>x;
  for(int i=0;i<n;i++)
  {
    if(a[i]==x)
    {
      c=1;
      break;
    }
  }
  if(c==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}