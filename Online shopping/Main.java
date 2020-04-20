#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s1,d1,sh1,s2,d2,sh2,s3,d3,sh3;
  cin>>s1>>d1>>sh1>>s2>>d2>>sh2>>s3>>d3>>sh3;
  float dp1=d1/100.0,dp2=d2/100.0,dp3=d3/100.0;
  int a=(s1-s1*dp1)+sh1,b=(s2-s2*dp2)+sh2,c=(s3-s3*dp3)+sh3;
  cout<<"In Flipkart Rs."<<a<<"\n";
  cout<<"In Snapdeal Rs."<<b<<"\n";
  cout<<"In Amazon Rs."<<c<<"\n";
  if(a<=b && a<=c)
    cout<<"He will prefer Flipkart"<<"\n";
  else if(b<=c)
    cout<<"He will prefer Snapdeal"<<"\n";
  else
    cout<<"He will prefer Amazon";
}