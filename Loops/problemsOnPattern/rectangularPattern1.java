package problemsOnPattern;
/*
 *  ******
 *  ******
 *  ******
 * print above pattern
 */
import java.util.Scanner;

public class rectangularPattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns you want:");
        int cols = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
