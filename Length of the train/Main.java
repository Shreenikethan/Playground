#include <iostream>
using namespace std;
class Calculation
{
    // Type your code here
  public:
  int x , y;
  void speedconversion(int x,int y)
  {
  cout<<"The length of train is "<<y*x*5/18<<" meter";
  }
};
int main() {
   
  // Type your code here
  Calculation s;
  int a,b;
  cin>>a>>b;
  s.speedconversion(a,b);
  return 0;
}//trai