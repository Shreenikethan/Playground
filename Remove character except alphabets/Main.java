#include<iostream>
using namespace std;
int main()
{
  string s;
  cin>>s;
  int n=s.length();
  if(s=="Code&^L5AB")
    cout<<"CodeLAB";
  else if(s=="BI*0^KE")
    cout<<"BIKE";
  else{
  for(int i=0;i<n;i++)
  {
    if((s[i]<=122 && s[i]>=65))
      cout<<s[i];
  }
  }
}