#include<iostream>
#include<bits/stdc++.h> 
using namespace std;
int main()
{
  int ball,run,c,b;
  float o,r;
  cin>>ball>>run>>c>>b;
  o=b/6+(b%6)*0.1;
  cout<<ball/6<<"\n"<<o; 
  cout<<"\n";
  cout << fixed << setprecision(1) <<c/o<<"\n"; 
  r=ball/6+(ball%6)*0.1; 
  cout << fixed << setprecision(1) <<run/r<<"\n"; 
  if(c/o>run/r)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}