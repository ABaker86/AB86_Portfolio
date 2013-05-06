//////////
//Assignments
//5/6/2013
//////////
#include <iostream>
using namespace std;

int main ()
{
    //concatenated sting lines
        cout << "This is the beginning of \n" "A concatenated line\n" "of strings!(3-strings).\n\n";
    int x = 1;
    int y = 2;

    cout << "The value of of 1 + 2 = " << x+y << "\n";
    cout << "Lets find out what happens when I let the user slect assign values to x and y.\n";
    cout << "Enter a number: ";
    cin >> x;
    cout << "Enter a second number: ";
    cin >> y;
    cout << "You entered "<< x << " for your first number and " << y << " for your second.\n";
    cout << "So when you add them together you get: "<< x << " + " << y << " = " << x+y << "\n";

    return 0;
}
