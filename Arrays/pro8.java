package Arrays;
/*
 * 
 * find the total number of triplets in the array whose sum is equal to the given value x.
 * 
 */
import java.util.Scanner;
public class pro8 {
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
    static int numOfTripletsEqualsToX(int arr[],int x){
        int count =0;
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    if((arr[i]+arr[j]+arr[k])==x){
                        System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"] ");
                        count++;
                    }
                }
            }
        }
        System.out.println();
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
        System.out.println(numOfTripletsEqualsToX(arr, x));

    }
}
