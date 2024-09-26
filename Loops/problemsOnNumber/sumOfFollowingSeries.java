package problemsOnNumber;


//series: 1-2+3-4+5....n

/*
 * logic: if odd then add
 *        else substract 
 * 
 */

import java.util.Scanner;

public class sumOfFollowingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int i=1;
        while(i<=num){
            if(i%2!=0){
                sum+=i;
            }else{
                sum-=i;
            }
            i++;
        }
        System.out.println("the sum of this series is "+sum);
    }
}
