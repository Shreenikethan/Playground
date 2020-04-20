#include<iostream>
using namespace std;
int sumZigZag(int n,int m,int (*mat)[1000]) 
{ 
  int s=0; 
  for(int i=0;i<n;i++) 
  { 
    for(int j=0;j<m;j++) 
    { 
      if(i==0 || i==n-1 || i+j==m-1) 
        s+=mat[i][j]; 
    } 
  } 
  return s;
}
int main()
{
  //Type your code here.
  int n,m; 
  cin>>n>>m; 
  int mat[1000][1000]; 
  for(int i=0;i<n;i++) 
  { 
    for(int j=0;j<m;j++) 
      cin>>mat[i][j]; 
  } 
  cout<<"Sum of Zig-Zag pattern is "<<sumZigZag(n,m,mat);
}