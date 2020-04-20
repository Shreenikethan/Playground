#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float f,g;
  cin>>n>>f;
  if(n==3)
  {
    cout<<f*2;
  }
  else if(n<3)
  {
    g=f/2.0;
    cout<<f+g;
  }
  else
  {
    cout<<"Number of items is more";
  }
}