#include<iostream>
using namespace std;
void printresult(int a[],int n,int m)
{
  int i,sum=0;
  for(i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  if(sum==n)
    cout<<"YES";
  else
    cout<<"NO";
}
int main()
{
  int n,m;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  printresult(a,n,m);
}