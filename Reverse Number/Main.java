#include <iostream>
int main() 
{
	// Type your code here
  int n,s=0,r;
  std::cin>>n;
  while(n>0)
  {
    r=n%10;
    s=s*10+r;
    n/=10;
  }
  std::cout<<s;
	return 0;
}