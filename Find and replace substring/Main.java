#include<iostream>
#include <string>
using namespace std;

int main()
{
  // Type your code here 
  string s,a,b; 
  getline(cin,s); 
  getline(cin,a); 
  getline(cin,b); 
  s.replace(s.find(a),a.length(),b);
  cout<<s;
  
  return 0;
}