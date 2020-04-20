#include<iostream>
#include<string>
using namespace std;
int main ()
{
    string str;
    int count = 0, i; 
    getline(cin,str);
    for (i = 0; str[i] != '\0';i++)
    {
        if (str[i] == ' ')
            count++;    
    }
    if((count+1)<=10)
      cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
    return 0;
}