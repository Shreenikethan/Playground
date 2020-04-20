#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x,y;
  cin>>x>>y;
  int c=(3-x)*(3-x);
  int d=(4-y)*(4-y);
  cout<<int(sqrt(c+d));
}