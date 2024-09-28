package conditionalOperators;
/*
 * A leap year is that exactly divisible by 4 except for century year(year ending with 00)
 * if if year is century year that should be divisble by 400.
 * 
 */
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        long year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Yes, the year "+year+" is leap year");
                }
                else{
                    System.out.println("No, the year "+year+" is not a leap year");
                }
            }
        }else{
            System.out.println("No, the year "+year+" is not a leap year");
        }
    }
}
