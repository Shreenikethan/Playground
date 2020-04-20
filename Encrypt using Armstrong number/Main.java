#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int s=0,rem,a=n,p=n,c=0;
  while(p>0)
  {
    c++;
    p/=10;
  }
    
    
    while(n>0)
    {
      rem=n%10;
      s+=power(rem,c);
      n/=10;
    }

  if(s==a)
    return 1;
  else 
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}