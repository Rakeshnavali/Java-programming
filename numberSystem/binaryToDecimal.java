package numberSystem;
import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int binary = sc.nextInt();
        int originalBinary =binary;
        int decimal = 0;
        int pow = 1;
        while(binary>0){
            int unit = binary%10;
            decimal += pow*unit;
            binary/=10;
            pow*=2;
        }
        System.out.println("the binary number "+originalBinary+" is: "+decimal);
    }
}
