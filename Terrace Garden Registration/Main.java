#include<iostream>
using namespace std;

class Customer
{
  public:
  string a,b,c,d,e,f;
  void ss(string a,string b,string c,string d,string e,string f){
  cout<<"Registration\n"<<"Enter your name\n"<<"Enter your address\n"<<"Contact Number\n"<<"E-Mail ID\n"<<"Enter proof type\n"<<"Enter proof id\n"<<"Customer Details\n";
  cout<<a<<endl<<b<<endl<<c<<endl<<d<<endl<<e<<endl<<f<<endl<<"Thank you for registering. Your id is 1...";
  }
};
int main()
{
    // Type your code here
  Customer aa;
  string g,h,i,j,l,m;
  cin>>g>>h>>i>>j>>l>>m;
  aa.ss(g,h,i,j,l,m);
    return 0;
}//terrace garden
