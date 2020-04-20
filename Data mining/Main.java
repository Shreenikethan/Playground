#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int r,s1=0,s2=0;
  while(n>0)
  {
    r=n%10;
    if(r%2==0)
      	s1+=r;
    else
      s2+=r;
    n=n/10;
  }
  int s3=s1+s2;
  if(s1==s2)
    cout<<"Yes";
 else
   cout<<"No";
}