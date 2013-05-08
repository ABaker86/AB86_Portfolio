//////////
//Simple Volume Calculator
//5/8/2013
//////////
#include <iostream>
using namespace std;


double calculateVolume (double height, double width, double depth)
{
    return height*width*depth;
}
int main()
{
float ht, wt, dt;

cout<< "Enter the Height, Width, and Depth of a block to get its Volume!\n";
cin>> ht >> wt >> dt;
cout << "The volume is: " << calculateVolume(ht, wt, dt);


return 0;
}
