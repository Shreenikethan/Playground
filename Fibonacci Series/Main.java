#include<bits/stdc++.h>
using namespace std; 
int fib(int n) 
{ 
    if (n <= 1) 
        return n; 
    return fib(n-1) + fib(n-2); 
} 
  
int main () 
{ 
    int n,result;
    cin>>n;
  	result=fib(n-1);
    cout <<"The term "<<n<<" in the fibonacci series is "<<result; 
    getchar(); 
    return 0; 
} 