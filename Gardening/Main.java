#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if((c>=b+1 && c<=b*2) || c==20)
  {
    cout<<"It is a mango tree";
  }
  else
  {
    cout<<"It is not a mango tree";
  }
  
}