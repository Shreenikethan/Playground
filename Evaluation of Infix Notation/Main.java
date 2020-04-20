#include<iostream>
#include<cstring> 
#include<cstdio> 
#include<cstdlib>
using namespace std;
int numstack[100],numtop=-1,optop=-1; 
char opstack[100][100];
int main()
{
  // Type your code here
  char s[10]; 
  while(scanf("%s",s)==1)
  { 
    if(atoi(s))
    {
      numstack[++numtop]=atoi(s); 
    } 
    else
    {
      if(strcmp(s,")")!=0)
        strcpy(opstack[++optop],s); 
      else
      { 
        int a=numstack[numtop],b=numstack[numtop-1]; 
        numtop-=2; 
        if(strcmp(opstack[optop],"+")==0)
          a+=b; 
        else if(strcmp(opstack[optop],"-")==0)
          a=b-a; 
        else if(strcmp(opstack[optop],"/")==0)
          a=b/a;
        else
          a*=b; 
        numstack[++numtop]=a; 
        optop-=2;
      } 
    }  
  } 
  while(optop>=0){ 
   
       int a=numstack[numtop],b=numstack[numtop-1]; 
        numtop-=2; 
        if(strcmp(opstack[optop],"+")==0)
          a+=b; 
        else if(strcmp(opstack[optop],"-")==0)
          a=b-a; 
        else if(strcmp(opstack[optop],"/")==0)
          a=b/a; 
        else
          a*=b; 
        numstack[++numtop]=a; 
        optop--;
  } 
  cout<<numstack[0];
  return 0;
}