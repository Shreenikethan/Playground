#include <iostream>
using namespace std;
int main() {
    int a;
    cin>>a;
    for(int i=1;i<=a;i++)
    {
      for(int j=1;j<=a;j++)
      {
        if(i%2==0)
        {
          if(j==1)
            cout<<i+1;
          else
            cout<<i;
        }
        else
        {
          if(j!=a)
            cout<<i;
          else
            cout<<i+1;
          
        }
      }
      cout<<"\n";
    }
    return 0;
}