
#include<iostream>
using namespace std;
class Floor {
    double w, l;
 public:
 Floor(double a, double b)
 {
   if(a<0)
     a = 0;
   if(b<0)
     b = 0;
   w = a;
   l = b;
 }
 double getArea()
 {
   return l*w;
 }
};

class Carpet {
   double cost;
 public:
 Carpet(double c)
 {
   if(c<0)
     c = 0;
   cost = c;
 }
 double getCost()
 {
   return cost;
 }
};

class Calculator {
   Floor *floor;
  Carpet *carpet;
 public:
 Calculator(Floor *p1, Carpet *p2)
 {
   floor = p1;
   carpet = p2;
 }
 double getTotalCost()
 {
   return floor->getArea() * carpet->getCost();
 }
};
int main(){
double l, b, c;
 cin>>l>>b>>c;
 Floor f(l, b);
 Carpet car(c);
 Calculator cal(&f, &car);
 cout<<cal.getTotalCost();
 return 0;
}