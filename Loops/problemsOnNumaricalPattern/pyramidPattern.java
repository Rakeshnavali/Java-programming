package problemsOnNumaricalPattern;
/*
 *   1
    121
   12321
  1234321
 */
import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=i-1; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
