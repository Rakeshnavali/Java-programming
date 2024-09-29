package Arrays;

import java.util.Scanner;

/*
 * find the number of occurences of a particular element x.
 * 
 */

public class pro1 {

    static void inputArr(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter "+arr.length+" elements into the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] =  sc.nextInt();
        }
    }
    
    
    static void printArr(int arr[]){
        System.out.println("The Values are: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    static int numOfOccurrences(int arr[],int x){
        int count =0;
        for(int ele:arr){
            if(ele==x){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        inputArr(arr);
        printArr(arr);
        System.out.println("Enter number that you have to chack an number Of occurances: ");
        int num = sc.nextInt();
        System.out.println(num+" is "+numOfOccurrences(arr, num)+" times Occur in an Array.");
    }
}
