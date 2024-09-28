import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a redius: ");
        int redius = sc.nextInt();
        double pi = 3.142;
        double area = pi*redius*redius;
        System.out.println("The area of Circle is "+area);
    }
}
