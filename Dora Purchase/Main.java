#include<iostream>
using namespace std;
class Amount{
    public:
  	int amount1;
  	int amount2;
};
int main()
{
	Amount a;
  	cin>>a.amount1>>a.amount2;
  	cout<<a.amount1+a.amount2;
	return 0;
}