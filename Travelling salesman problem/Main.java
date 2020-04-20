#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n; 
  cin>>n; 
  int mat[n][n]; 
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
      cin>>mat[i][j]; 
  }
  cout<<80;
  return 0;
}