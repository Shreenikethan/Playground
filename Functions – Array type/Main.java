#include<iostream>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  int a[n],te=0,to=0,tt;
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      te+=1;
    else if(a[i]%2!=0)
      to+=1;
  }
  if(te==n)
    cout<<"The array is Even";
  else if(to==n)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
    
  
}