package problemsOnNumber;

import java.util.Scanner;

public class riverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); 
        int num = sc.nextInt();
        int orginalNum = num;
        int riverse =0;
        while(num>0){ 
            riverse= riverse*10+(num%10);
            num/=10;
        }
        System.out.println("sum of Digits in "+orginalNum+" is "+riverse);
    }
}


/*
 * 
 * 
 * logic:  while(num>0)
 *           riverse = riverse * 10 + (num%10)
 *           num/10
 * 
 * ex: num = 253
 *          riverse = 0*10+(3) => 3
 *                  =  3*10+(5) => 35
 *                  =  34*10=(2) => 352
 */
