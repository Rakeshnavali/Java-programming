package Arrays;
/*
 * find the unique number in a given array where all the elements are being
 * repeated twice with one vlaued being unique
 * 
 * arr = {1,2,3,4,3,2,1}
 * o/p: 4
 * 
 * 
 */
import java.util.Scanner;

public class pro9 {
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
    static int findUniqueEle(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean uniqueEle = true;
            for(int j=0; j<arr.length; j++){
                if(i!=j && arr[i]==arr[j]){
                    uniqueEle = false;
                    break;
                }
            }
            if(uniqueEle){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        inputArr(arr);
        printArr(arr);
        System.out.println("The unique number is "+findUniqueEle(arr)); 
    }
}
