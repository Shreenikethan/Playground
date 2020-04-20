#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n; 
  cin>>n; 
  int mat[n][n]; 
  int sum=0;
  for(int i=0;i<n;i++) 
  { 
    
    for(int j=0;j<n;j++) 
    {
      cin>>mat[i][j]; 
      if(i==0) 
        sum+=mat[i][j]; 
    }
  }
  for(int i=0;i<n;i++) 
  { 
    int s1=0,s2=0;
    for(int j=0;j<n;j++) 
    { 
      s1+=mat[i][j]; 
      s2+=mat[j][i]; 
    } 
    if(sum!=s1|| sum!=s2) 
    { 
      cout<<"No"; 
      return 0; 
    } 
  }
  int s1=0,s2=0;
  for(int i=0;i<n;i++) 
  {
    s1+=mat[i][i]; 
    s2+=mat[n-1-i][n-1-i]; 
  } 
  if(sum!=s1||sum!=s2) 
    cout<<"No"; 
  else
  cout<<"Yes"; 
  
}