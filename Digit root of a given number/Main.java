#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,r,r1,sum1;
  cin>>n;
  while(n!=0)
  {
    r=n%10;
    sum+=r;
    n/=10;
  }
  while(sum!=0)
  {
    r1=sum%10;
    sum1+=r1;
    sum/=10;
  }
  cout<<sum1;
}