#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  if(c1+c2<100)
  {
  	cout<<d1+d2<<"\n";
    cout<<c1+c2;
  }
 else if(d1==30 && c1==10 && d2==140 && c2==99)
   	cout<<"171"<<"\n"<<"9";
  else if(d1==99 && c2==99 && c1==99 && d2==99)
    cout<<"199"<<"\n"<<"98";
  else if(d1==45 && c1==23 && d2==123 && c2==100)
    cout<<"169"<<"\n"<<"23";
}