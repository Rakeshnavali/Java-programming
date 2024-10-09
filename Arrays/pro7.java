package Arrays;
/*
 * 
 * find the total number of pairs in the array whose sum is equal to the given value x.
 * 
 */
import java.util.Scanner;
public class pro7 {
    static void inputArr(int arr[]){
        System.out.println("Enter an array elements: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
    }
    static void printArr(int arr[]){
        System.out.println("The array elements are: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int numOfPairsEqualsToX(int arr[],int x){
        int count =0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i]+arr[j])==x){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        inputArr(arr);
        printArr(arr);
        System.out.println("Enter a number that you have to compare: ");
        int x = sc.nextInt();
        System.out.println(numOfPairsEqualsToX(arr, x));

    }
}
