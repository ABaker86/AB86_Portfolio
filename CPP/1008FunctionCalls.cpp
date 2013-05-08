//////////
//
//5/8/2013
//////////
#include <iostream>/*Beeps and displays a msg.*/
using namespace std;
/*No prototype is needed because the methods are called prior to the Main function*/
void ErrorMsg1()
{
cout<< "\n\a Error 1 has occured!\n";/*Beeps and displays a msg.*/

}
void ErrorMsg2()
{
cout<< "\a Error 2 has occured!\n"; /*Beeps and displays a msg.*/
}
int main()

{

ErrorMsg1();
ErrorMsg2();
return 0;
}
