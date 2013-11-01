/**
 * 
 */
package loops;

/**
 * @author Adam
 * @date 10/301/2013
 * @instructor Master,L.
 * @Course ITSD322
 * @School American InterContinental University
 */
public class loops {
	
		   public static void main (String[] args) {
			   System.out.println("\tLets Get Ready to Multiply!\n\t\tAdam Baker\n\t\t10/31/2013\n\tITSD322-Instructor: Masters, L.\n\tAmerican InterContinental University\n");

		      /**
		       * The following nested for loops is intended to produce a simple
		       * multiplication table.The first four loop prints only the far left column
		       * of the multiplication table. The second four loop prints all results of 
		       * the multiplication solutions.
		       * 
		       * @param i=initial counter
		       * @param j=secondary counter
		       * 
		       */
			   int mult;
			   //This for loops prints all numbers in the far left column
			   //For (counter initialization statement, conditional statement, incrementation)
			   for (int i = 1; i <= 12; i++) {
			       //prints the numbers 1-12  
				   System.out.print(i);
			         //determines where to place colon (:) symbol
			         if (i < 10) System.out.print(" :");
			         else System.out.print(":");
			   //For (counter initialization statement, conditional statement, incrementation)
			   //As before the for loop takes three parameters. 
			         for (int j = 1; j <= 12; j++) {
			        	//multiplies parameter i and j to get multiplication solution
			            mult = i*j;
			            //prints solution to console
			            System.out.print(" " + mult);
			            //adds two or three spaces depending on the number of digits the solution has
			            if (mult < 10) System.out.print("  ");
			            else if (mult < 100) System.out.print(" ");
			         }
			         //prints new line for each row
			         System.out.println();
			      }System.out.println("\n\t\t\tReferences\n Wagner. (2001). Multiplication Table. Retrieved \n\tfrom http://www.cs.utsa.edu/~wagner/\n\tCS1713/mult/mult.html");
		      }// end of main
		   
		   }