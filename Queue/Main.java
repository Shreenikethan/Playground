#include<iostream>
using namespace std;
void queue(int n,int m,int a[])
{
  if(n>m)
    cout<<m;
  else if(m>n)
    cout<<n;
  else if(n==m)
    cout<<n;
}
int main()
{
  int n,m;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  queue(n,m,a);
}