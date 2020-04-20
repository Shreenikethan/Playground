#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s1,s2;
  cin>>s1>>s2;
  int k=s1.compare(s2);
  if(k==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}