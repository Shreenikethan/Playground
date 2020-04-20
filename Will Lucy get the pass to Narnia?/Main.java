#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cout<<"Enter first number : Enter second number : Menu\n";
  cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>a>>b>>c;
  switch(c)
  {
    case 1: 
      cout<<a+b;
      break;
    case 2: 
      cout<<a-b<<"\n";
      break;
    case 3:
      cout<<a*b<<"\n";
      break;
    case 4:
      cout<<a/b<<"\n";
      break;
    case 5:
      cout<<a%b<<"\n";
      break;
    default:
      cout<<"Invalid operation"<<"\n";
      break;
  }
}
      