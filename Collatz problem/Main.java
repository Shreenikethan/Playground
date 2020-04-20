#include<iostream>
using namespace std;
int main()
{
  int a,c=0;
  cin>>a;
  cout<<a<<"\n";
  while(a!=1)
  {
    if(a%2==0){
      a/=2;
      cout<<a<<"\n";
    }
    else{
      a=(3*a)+1;
      cout<<a<<"\n";
    }
    c++;
  }
  cout<<c;
  	
  	
    
}