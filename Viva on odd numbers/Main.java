#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  float c=0;
  int a;
  while(cin>>a){
    if(a%2!=0)
      c+=1;
    else if(a<0)
      c-=1;
  	else if(a%2==0)
      c-=0.5;
  }
  cout<<setprecision(1)<<fixed;
  cout<<c;
}