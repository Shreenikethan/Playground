#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here. .
  char s[1000][1000]; 
  char str[100];
  int c=0;
  while(cin>>str) { 
    if(strcmp("####",str)==0) 
      break; 
    else 
      strcpy(s[c++],str);
  } 
  int i=0; 
  cout<<s[0]<<"\n";  
  char prev=s[0][strlen(s[0])-1] ; 
  i++;
  while(i<c) 
  { 
    if(s[i][0]==prev) 
    { 
      prev=s[i][strlen(s[i])-1];
        cout<<s[i]<<"\n"; 
    } 
    i++;
  }
  
}