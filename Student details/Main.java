#include<iostream>
#include<cstring>
using namespace std;
struct Student 
{
  char name[30]; 
  char department[20]; 
  int yearOfStudy; 
  float cgpa; 
};
int main()
{
  int N,i=1;
  cout<<"Enter the number of students\n";
  cin>>N;
  Student s1[100],temp;
  while(i<=N)
  {
    cout<<"Enter the details of student "<<i<<endl;
    cout<<"Enter name\n";
    cin>>s1[i-1].name;
    cout<<"Enter department\n";
    cin>>s1[i-1].department;
    cout<<"Enter year of study\n";
    cin>>s1[i-1].yearOfStudy;
    cout<<"Enter cgpa\n";
    cin>>s1[i-1].cgpa;
    i++;
  }
  for(int i=0;i<N-1;i++)
    for(int j=0;j<N-1;j++)
      if(strcmp(s1[j].name,s1[j+1].name)>0)
      {
        temp=s1[j];
        s1[j]=s1[j+1];
        s1[j+1]=temp;
      }
  cout<<"Details of students\n";
  for(int i=0;i<N;i++)
  {
    cout<<"Student "<<i+1<<endl;
    cout<<"Name:"<<s1[i].name<<endl;
    cout<<"Department:"<<s1[i].department<<endl;
    cout<<"Year of study:"<<s1[i].yearOfStudy<<endl;
    cout<<"CGPA:"<<s1[i].cgpa<<endl;
  }
}