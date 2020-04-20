#include<iostream>
using namespace std;
class Student{
  // Type your code here
  public:
  int age,standard;
  string firstname,lastname;
  int getage(){return age;}
  int getstandard(){return standard;}
  string getfirst(){return firstname;}
  string getlast(){return lastname;}
  int setage(int a)
  {
    if(a<6 || a>17)
      age=0;
  }
  int setstandard(int a)
  {
    if(a<1 || a>12)
      standard=0;
  }
 
     
};
int main(){
  // Type your code here
  Student s;
  cin>>s.age>>s.firstname>>s.lastname>>s.standard;
  s.setage(s.age);
  s.setstandard(s.standard);
  if(s.age==0 || s.standard==0)
    cout<<"No Admission";
  else{
    cout<<s.age<<"\n"<<s.lastname<<", "<<s.firstname<<"\n"<<s.standard<<"\n\n";
    cout<<s.age<<","<<s.firstname<<","<<s.lastname<<","<<s.standard;
  }
  return 0;
}