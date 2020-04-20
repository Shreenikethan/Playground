#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int so=0,se=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      se+=a[i];
    else
      so+=a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<se<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<so<<"\n";
}