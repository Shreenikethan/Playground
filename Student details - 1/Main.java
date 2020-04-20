#include<iostream>
using namespace std;
struct student
{
  int age;
  char fn[1000];
  char ln[100];
  int standard;
};
int main()
{
  struct student s;
  cin>>s.age;
  cin>>s.fn;
  cin>>s.ln;
  cin>>s.standard;
  cout<<s.age<<" "<<s.fn<<" "<<s.ln<<" "<<s.standard;
}