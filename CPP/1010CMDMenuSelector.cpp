//////////
//CMD Menu Selector
//5/8/20013
//////////
#include <iostream>
using namespace std;

void displayMenu();
int getSelection();

int main()
{
displayMenu();
int selection = getSelection();

if (selection == 1)
    cout << "Please Wait...Processing Recievables" << endl;
else if (selection == 2)
    cout << "One Moment...Processing Payables" << endl;
else if (selection == 3)
    cout << " --Good Bye-- " << endl;
else
    cout << "\a Invalid Selection " << endl;

return 0;
}

void displayMenu()
{
cout << "--- Menu ---\n" "1 =Receivables\n" "2=Payables" "3=Quit"<< endl;
}
int getSelection ()
{
int selection;
cout << "Enter a Selection Please: ";
cin >> selection;

return selection;
}
