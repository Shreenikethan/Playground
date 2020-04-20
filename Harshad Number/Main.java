#include<iostream>
using namespace std;
int main()
{ 
  int n,m,a;         
 int sum=0; 
cin>>n;                      
 m=n;                        
 while(n!=0) 
 { a=n%10;        
  n=n/10; 
  sum=sum+a; 
 }
 if((m%sum)==0) 
{
 cout<<"Harshad Number"; 
} 
else
 { 
cout<<"Not Harshad Number"; 
} 
}