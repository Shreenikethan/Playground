#include<iostream>
int main()
{
  int a;
  std::cin>>a;
  int i=1;
  int b=6;
  int j=1;
  while(i<=a)
  {
    std::cout<<b<<" ";
    b=b+(5*j);
    j+=1;
    i++;
  }
}
    