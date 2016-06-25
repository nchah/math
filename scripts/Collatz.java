/* 
 * Collatz.java
 * Run collatz calcuations on the command line.
 *
 * $ java Collatz
 * Enter number to test Collatz Conjecture: 
 * 10000
 * 10000.0  -> 5000.0 -> 2500.0 -> 1250.0 -> 625.0 +> 1876.0 -> 938.0 -> 469.0 +> 1408.0 -> 704.0 -> 352.0 -> 176.0 -> 88.0 -> 44.0 -> 22.0 -> 11.0 +> 34.0 -> 17.0 +> 52.0 -> 26.0 -> 13.0 +> 40.0 -> 20.0 -> 10.0 -> 5.0 +> 16.0 -> 8.0 -> 4.0 -> 2.0 => 1 (29.0 ops)
 *
 */

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


