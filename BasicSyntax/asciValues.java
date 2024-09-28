/*
 * A=65
 * Z=90
 * a=97
 * z=122
 * 
 * 
 * if we want find the ascii value of any character we should do the typecasting
 * ch = "a"
 * int x = (int)ch;
 */

 import java.util.Scanner;
public class asciValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);
        int ascii_ch = (int)ch; 
        System.out.println("Ascii value of "+ ch +" is "+ascii_ch);  
    }
}
