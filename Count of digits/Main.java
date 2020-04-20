#include<iostream>
int main()
{
  long int n;
  std::cin>>n;
  int ctr=0;
  do
  {
    n/=10;
    ctr++;
  }while(n!=0);
  std::cout<<ctr;
}