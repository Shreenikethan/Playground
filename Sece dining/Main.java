#include<iostream> 
#include<cstring>
using namespace std;
int main()
{
  char s[100];
   cin>>s;
   int a;
  cin>>a; 
  if(strlen(s)==5)
  {
    if(a==1)
      cout<<"Left Handed"; 
    else
      cout<<"Right Handed"; 
  } 
  else
  {
    if(a!=1)
      cout<<"Left Handed"; 
    else
      cout<<"Right Handed"; 
  } 
}