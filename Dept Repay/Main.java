#include<iostream>
using namespace std;
int main()
{
  int x,y,r;
  cin>>x>>y>>r;
  int roi=x*y*r/100;
  cout<<roi<<"\n";
  cout<<roi+x<<"\n";
  cout<<roi*0.02<<"\n";
  cout<<(roi+x)-(roi*0.02);
}