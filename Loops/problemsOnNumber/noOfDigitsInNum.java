package problemsOnNumber;

import java.util.Scanner;

class noOfDigitsInNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int count =0;
        while(num>0){
            count++;
            num/=10;
        }
        System.out.println("Numbr of Digits in "+originalNum+" is "+count);
    }
}