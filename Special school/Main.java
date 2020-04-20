#include<iostream>
using namespace std;
int main()
{
  string s1,s2;
  cin>>s1>>s2;
  int n=s1.length(),count=0;
  for(int i=0;i<n;i++)
  {
    if(s1[i]==s2[n-i-1])
      count++;
  }
  if(count==n)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}