
// ****************************************************************
//   PowersOf2.java
//
//   Print out as many powers of 2 as the user requests
//              
// ****************************************************************
import java.util.Scanner;
 
public class PowersOf2
{
        public static void main(String[] args)
        {
            int numPowersOf2;        //How many powers of 2 to compute
            int nextPowerOf2 = 1;        //Current power of  2
            int exponent;                //Exponent for current power of 2 -- this
            int printedPower;                             //also serves as a counter for the loop
            Scanner scan = new Scanner(System.in);
 
            System.out.println("How many powers of 2 would you like printed?");
            numPowersOf2 = scan.nextInt();
            exponent = 1;   
            //print a message saying how many powers of 2 will be printed
            //initialize exponent -- the first thing printed is 2 to the what?
            printedPower = 1;
            System.out.println(printedPower);
            for (exponent = 1; exponent < numPowersOf2; exponent++)
            {
                //print out current power of 2
                printedPower = 2*printedPower;
                //find next power of 2 -- how do you get this from the last one?
                System.out.println(printedPower);
                //increment exponent
 
            }
        }
}