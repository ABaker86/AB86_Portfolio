//////////
//Return Value Function
//5/8/2013
//////////
#include <iostream>
using namespace std;

int addTwoNumbers (int x, int y)
{
    int z;
    z = x + y;
    return z;
}
int main ()
{
    int x;
    int y;

cout<< "Enter one number:\n";
cin >> x;
cout<< "Enter The second number:\n";
cin >> y;
cout<< "The end result is: \n"<< addTwoNumbers (x, y);

    return 0;
}
