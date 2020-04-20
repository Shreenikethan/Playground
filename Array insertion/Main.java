#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,insert,pos; 
  cin>>n; 
  int arr[n+2]; 
  for(int i=0;i<n;i++) 
    cin>>arr[i]; 
  cin>>pos>>insert; 
  cout<<"Enter the number of elements in the array\nEnter the elements in the array\nEnter the location where you wish to insert an element\n";  
  if(pos<1 || pos>n) 
  { 
    cout<<"Invalid Input"; 
    return 0; 
  }
  cout<<"Enter the value to insert\nArray after insertion is\n"; 
  for(int i=n-1;i>pos-2;i--) 
  {  
    arr[i+1]=arr[i]; 
  }
  arr[pos-1]=insert; 
  for(int i=0;i<=n;i++) 
    cout<<arr[i]<<"\n";
    
  
  
}