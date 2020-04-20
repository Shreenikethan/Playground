#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;
  if(a>=13)
  {
    if(b>11 && b<14)
      cout<<"$5.00";
    else
      cout<<"$8.00";
}
  else if(a<13)
  {
    if(b>10 && b<13)
      cout<<"$4.00";
    else
      cout<<"$2.00";
  }
}