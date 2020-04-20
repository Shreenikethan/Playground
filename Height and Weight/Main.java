#include<iostream>
using namespace std;
class Nailah{
  public:
    int age;
  	float height;
};
int main()
{
	Nailah n;
  	cin>>n.age>>n.height;
  	cout<<"Age: "<<n.age<<endl<<"Height: "<<n.height;
	return 0;
}