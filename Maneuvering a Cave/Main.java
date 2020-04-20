#include<iostream>
using namespace std;
#define ull unsigned long long int 
int main(){
  // Type your code here 
  ull n,m; 
  cin>>n>>m;
  ull mat[n][m];
  mat[0][0]=0;
  for(ull i=1;i<n;i++) 
                mat[i][0]=1; 
  for(ull j=1;j<m;j++) 
                mat[0][j]=1; 
  for(ull i=1;i<n;i++) 
  { 
     for(ull j=1;j<m;j++) 
          mat[i][j]=mat[i-1][j]+mat[i][j-1]; 
  } 
  ull d=mat[n-1][m-1];
  if(n==1 ) 
    d++;
 cout<<d;
  return 0;
}