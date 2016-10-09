/** Collatz.scala
 * Run collatz calcuations on the command line.
 *
 *
 */




/** Equivalent Java code:

import java.util.Scanner;
import java.lang.String;


public class Collatz {
    
    public static void main (String[] args) {
        double n, stackCount = 0;
        String stackMessage = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to test Collatz Conjecture: ");
        
        n = in.nextDouble();
        
        String nString = Double.toString(n);
        stackMessage = stackMessage + nString + " ";

        while (n != 1) {
            if (n / 2 == 1) {
                n = 1;
                stackMessage = stackMessage.concat(" => 1");
                stackCount += 1;
            }
            else if (n % 2 == 0) {
                n = n / 2;
                String nStr = Double.toString(n);
                stackMessage = stackMessage.concat(" -> " + nStr);
                stackCount += 1;
            }
            else if (n % 2 != 0 && n != 1) {
                n = (n * 3) + 1;
                String nStr = Double.toString(n);
                stackMessage = stackMessage.concat(" +> " + nStr);
                stackCount += 1;
            }
        }

        System.out.println(stackMessage + " (" + Double.toString(stackCount) + " ops)");
    }  
}

*/



