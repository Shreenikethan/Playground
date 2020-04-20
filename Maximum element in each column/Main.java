#include<iostream>
using namespace std;
int main()
{
  //Type your code here. 
  int n,m; 
  cin>>n>>m; 
  int mat[100][100]; 
  for(int i=0;i<n;i++) 
  { 
    for(int j=0;j<m;j++) 
    cin>>mat[i][j]; 
  } 
  for(int i=0;i<m;i++) 
  { 
    int max=-1;
    for(int j=0;j<n;j++) 
    { 
      if(mat[j][i]>max) 
        max=mat[j][i]; 
    } 
    cout<<max<<endl; 
  }
}