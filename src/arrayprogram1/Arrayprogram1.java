/*Malika Sharma
 *18/10/2019
 *Array Program 1 
 *
 */

package arrayprogram1;

import java.util.Scanner;

/**
 *
 * @author masha2470
 */
public class Arrayprogram1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner keyedInput = new Scanner (System.in);
        //Array
        int [ ] numbers = new int [20];
        int total = 0;
        //prompt user
        System.out.println("Enter twenty integers and they will be added together:");
        for (int i = 0; i <= 19; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        

        for (int i = 0; i <= 19; i = i + 1)
        {
             total = total + numbers[i];
        }
        //output
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
    }
    
}
