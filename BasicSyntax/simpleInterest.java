import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price: ");
        int p = sc.nextInt();
        System.out.println("enter a rate: ");
        int r = sc.nextInt();
        System.out.println("enter a time: ");
        int t = sc.nextInt();
        double si = (p*t*r)/100;
        System.out.println("Simple Interest is "+si);
    }
}
