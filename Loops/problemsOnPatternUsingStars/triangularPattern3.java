package problemsOnPatternUsingStars;

import java.util.Scanner;

/**
 * triangularPattern
 * 
 *    *
 *   **
 *  ***
 * ****
 * 
 */
public class triangularPattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}