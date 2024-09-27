package numberSystem;
import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        int originalDecimal = decimal;
        int binary = 0;
        int pow = 1;
        
        while(decimal>0){
           int  parity = decimal % 2;
           binary+=parity*pow;
           decimal/=2;
           pow*=10;
        }
        System.out.println("The decimal number "+originalDecimal+" is:"+binary);
    }
}
