#include<iostream>
int main(){
  // Type your code here
  long int n,c=1;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    c*=i;
  }
  std::cout<<c;
    
}