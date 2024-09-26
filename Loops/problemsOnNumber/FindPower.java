package problemsOnNumber;

//Given 2 numbers a and b. Find a raise to the power b
import java.util.Scanner;
public class FindPower{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to number to find a raise to the power b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pow = 1;
        for(int i=1; i<=b; i++){
           pow *= a;
        }
        System.out.println(a+" pow "+b+" is "+pow);
    }
}