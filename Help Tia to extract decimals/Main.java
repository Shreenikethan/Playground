#include<iostream>
#include<string> 
#include<cstring>
using namespace std;
int main() 
{ 
	string fnum; 
	char decimals[100];
	//Type your code here 
    cin>>fnum; 
    int dot=fnum.find(".")+1; 
    if(dot<=0) 
    { 
      cout<<"Floating part is :"; 
      return 0; 
    }
    int length1=fnum.copy(decimals,fnum.size(),dot); 
    decimals[length1]='\0'; 
    cout<<"Floating part is : "<<decimals;
}