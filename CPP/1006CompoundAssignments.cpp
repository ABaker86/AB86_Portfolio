//////////
//Compound Assignments
//5/6/2013
//////////

#include <iostream>
using namespace std;

int main()
{
    int total, sum, value;

    total = 1500;
    sum = 95;
    value = 5;
    cout << "The initial values are total: 1500, sum, 95, and value 5\n";
    sum *= value;
    cout << "The sum times the value is " << sum << " is equal to the new sum \n";
    total += sum;
    cout << "The total plus the new sum is " << total<< "\n";


    return 0;
}
