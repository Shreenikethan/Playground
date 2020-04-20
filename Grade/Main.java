#include<iostream>
#include<string>
#include<iterator>
using namespace std;
/*class Person{
  public:
    string fn;
  string ln;
  int id;
  int size;
};
class Student : public Person
{
    void display()
    {
    cout<<fn<<"\n";
    cout<<ln<<"\n";
    cout<<id<<"\n";
    }
};*/
int main()
{
    string fn,ln;
  	int a,b;
  	cin>>fn>>ln>>a>>b;
  	int c[b],sum=0;
  	for(int i=0;i<b;i++)
      cin>>c[i];
   for(int i=0;i<b;i++)
     sum+=c[i];
  float avg=sum/b;
  cout<<fn<<"\n";
  cout<<ln<<"\n";
  cout<<a<<"\n";
  if(avg<=100 && avg>=90)
    cout<<"O";
  else if(avg<90 && avg>=80)
    cout<<"E";
  else if(avg<80 && avg>=70)
    cout<<"A";
  else if(avg<70 && avg>=55)
    cout<<"P";
  if(avg<55 && avg>=40)
    cout<<"D";
  else if(avg<40)
    cout<<"T";
}