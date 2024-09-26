package problemsOnNumber;

import java.util.Scanner;

public class sumOfDigitsInNum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int orginalNum = num;
        int sum =0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("sum of Digits in "+orginalNum+" is "+sum);
    }
}
