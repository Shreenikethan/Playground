#include<iostream>
using namespace std;
int main()
{
 int a,b,c,d,i;
  cin>>a>>b>>c;
  cout<<"The treasure is in box which has number ";
  if((a>b && a<c)||(a<b && a>c))
    cout<<a;
  else if((b>a && b<c)||(b<a && b>c))
    cout<<b;
  else 
    cout<<c;
  cout<<"\n";
  for(i=1;i<=a && i<=b && i<=c;i++) 
    if(a%i==0 && b%i==0 && c%i==0)
      d=i; 
  cout<<"The code to open the box is "<<d;
}