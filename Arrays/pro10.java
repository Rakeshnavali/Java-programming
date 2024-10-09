package Arrays;
import java.util.Scanner;
/*
 * find the second largest in the given array.
 * 
 */
public class pro10 {
    static void inputArr(int arr[]){
        System.out.println("Enter the Array size: ") ;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    static void PrintArr(int arr[]){
        System.err.println("The array values: ");
        for(int i=0; i<arr.length; i++){

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

    }
}
