package problemsOnNumaricalPattern;
/*
 * 
 *  1 2 3 4
 *  1 2 3 4
 *  1 2 3 4 
 *  1 2 3 4
 * 
 */
import java.util.Scanner;
class rectangularPattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}