import java.util.Scanner;

class takingInput{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        System.out.println(a+" + "+b+" = "+c);
    }
}