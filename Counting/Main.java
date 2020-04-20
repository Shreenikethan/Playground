#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here. 
  char s[10000]; 
  cin.getline(s,10000); 
  int vow=0,con=0,ws=0,dig=0,sym=0; 
  for(int i=0;i<strlen(s);i++) 
  { 
    if(s[i]==' ') 
      ws++; 
    else if(isalpha(s[i])) 
    { 
      if(strrchr("aeiou",tolower(s[i])) )
         vow++; 
      else 
         con++; 
    } 
    else if(isdigit(s[i])) 
      dig++; 
    else 
      sym++; 
  } 
  cout<<"Vowels:"<<vow; 
  cout<<"\nConsonants:"<<con; 
  cout<<"\nWhite Spaces:"<<ws; 
  cout<<"\nDigits:"<<dig; 
  cout<<"\nSymbols:"<<sym;
}