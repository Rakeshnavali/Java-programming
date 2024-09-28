import java.util.Scanner;



/*
 * 
 * a=5
 * b=2
 *  
 * ans:
 *  q=2
 *  r=1
 * 
 * 
 */
public class findreminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int reminder=0;
        if(a>b){
            int quetient = a/b;
            reminder = a-(b*quetient);
        }
        System.out.println("the reminder is "+reminder);
    }
}
