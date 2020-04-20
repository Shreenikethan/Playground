#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  int sum=0,c=a+b;
  for(int i=1;i<c;i++)
  {
    if(c%i==0)
      	sum+=i;
  }
  if(c==sum)
    	cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}