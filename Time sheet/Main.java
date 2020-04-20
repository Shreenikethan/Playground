#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,a1,b1,c1,d1,e1,f1,g1,bB,eE,cC,dD,fF;
  cin>>a>>b>>c>>d>>e>>f>>g;
  a1=a*150;
  g1=g*125;
  if(b>8)
  {
  bB=b-8;
  b1=(115*bB)+(8*100);
  }
  else
    b1=b*100;
  if(e>8)
  {
    eE=e-8;
    e1=(115*eE)+(8*100);
  }
  else
    e1=e*100;
  if(c>8)
  {
    cC=c-8;
    c1=(115*cC)+800;
  }
  else
    c1=c*100;
  if(d>8)
  {
    dD=d-8;
    d1=(115*dD)+800;
  }
  else
    d1=d*100;
  if(f>8)
  {
    fF=f-8;
    f1=(115*fF)+800;
  }
  else
    f1=f*100;
  cout<<a1+b1+c1+d1+e1+f1+g1;
 
}

