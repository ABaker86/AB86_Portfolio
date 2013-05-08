//////////
//
//5/8/2013
//////////
#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

 int main()
 {
     int counter;
     for (counter = 0; counter < 10; counter++)
     {
         srand(counter + 1);
         cout<<"Randome number"<<counter+1<<" : " << rand() << endl;
     }

     return 0;
 }
