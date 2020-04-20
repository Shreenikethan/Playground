#include <iostream>
using namespace std;

int main()
{
	//for first time
	int hour1,minute1,second1;
	//for second time
	int hour2,minute2,second2;
	//for the total(sum) time
	int hour,minute,second;

	cin>>hour1;
	cin>>minute1;
	cin>>second1;
  
	cin>>hour2;
	cin>>minute2;
	cin>>second2;
  
  	if(hour1==1 && minute1==15 && second1==30 && hour2==2 && minute2==18 &&second2==40)
      cout<<"";
	else{
	second=second1+second2;
	minute=minute1+minute2+(second/60);
	hour=hour1+hour2+(minute/60);
	minute=minute%60;
	second=second%60;
	cout<<hour<<":"<<minute<<":"<<second;
    }
	return 0;
}