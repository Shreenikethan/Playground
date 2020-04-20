#include<iostream>
#include<cstring>
using namespace std;
struct college 
{
  char name[30]; 
  char city[100]; 
  int establishmentyear; 
  float passpercentage; 
};
int main()
{
  int N,i=1;
  cout<<"Enter the number of colleges\n";
  cin>>N;
  college c[100],temp;
  while(i<=N)
  {
    cout<<"Enter the details of college "<<i<<endl;
    cout<<"Enter name\n";
    cin>>c[i-1].name;
    cout<<"Enter city\n";
    cin>>c[i-1].city;
    cout<<"Enter year of establishment\n";
    cin>>c[i-1].establishmentyear;
    cout<<"Enter pass percentage\n";
    cin>>c[i-1].passpercentage;
    i++;
  }
  for(int i=0;i<N-1;i++)
    for(int j=0;j<N-1;j++)
      if(strcmp(c[j].name,c[j+1].name)>0)
      {
        temp=c[j];
        c[j]=c[j+1];
        c[j+1]=temp;
      }
  cout<<"Details of colleges\n";
  for(int i=0;i<N;i++)
  {
    cout<<"College:"<<i+1<<endl;
    cout<<"Name:"<<c[i].name<<endl;
    cout<<"City:"<<c[i].city<<endl;
    cout<<"Year of establishment:"<<c[i].establishmentyear<<endl;
    cout<<"Pass percentage:"<<c[i].passpercentage<<endl;
  }
}