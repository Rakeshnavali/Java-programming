package conditionalOperators;
import java.util.Scanner;
public class findNumIsDivBy3Or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num%3==0||num%5==0){
            int res = (num%3==0)?3:5;
            System.out.println("Yes, The number "+num+" is divisible by "+res);
        }
    }
}
