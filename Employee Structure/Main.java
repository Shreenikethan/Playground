#include<iostream>
using namespace std;
struct employee
{
  char name[100];
  int id;
  int age;
  char desig[100];
  long salary;
};
int main()
{
  employee e;
  cout<<"Enter name:"<<"\n";
  cin>>e.name;
  cout<<"Enter ID:"<<"\n";
  cin>>e.id;
  cout<<"Enter age:"<<"\n";
  cin>>e.age;
  cout<<"Enter designation:"<<"\n";
  cin>>e.desig;
  cout<<"Enter Salary:"<<"\n";
  cin>>e.salary;
  cout<<"Employee Details"<<"\n";
  cout<<"Name of the Employee : "<<e.name<<"\n";
  cout<<"ID of the Employee : "<<e.id<<"\n";
  cout<<"Age of the Employee : "<<e.age<<"\n";
  cout<<"Designation of the Employee : "<<e.desig<<"\n";
  cout<<"Salary of the Employee : "<<e.salary;
}