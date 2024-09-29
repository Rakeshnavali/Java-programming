package Arrays;
/*
 * 
 * find the 2nd smallest and largest element in an array.
 * 
 */

 import java.util.Scanner;
 import java.util.Arrays;
public class pro6 {
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
    static int[] secondSmallestLargestEle(int arr[]){
        Arrays.sort(arr);
        int smallest = arr[0];
        int secondSmallest = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=smallest){
                secondSmallest = arr[i];
                break;
            }
        }

        int largest = arr[arr.length-1];
        int secondLargest = -1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]!=largest){
                secondLargest = arr[i];
                break;
            }
        }
        return new int[] {secondSmallest,secondLargest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        inputArr(arr);
        printArr(arr);
        int res[] = secondSmallestLargestEle(arr);
        System.out.println("The smallest element is "+res[0]);
        System.out.println("The largest element is "+res[1]);
    }
}
