package Arrays;
/*
 * 
 * Count the number of elements strictly grater than value x.
 * 
 */

import Arrays.pro1;
import java.util.Scanner;
public class pro3 {
    static int  numOfEleStrictlyGreaterThanNum(int arr[],int num){
        int count=0;
        for(int ele:arr){
            if(ele>num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        pro1 p = new pro1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        p.inputArr(arr);
        p.printArr(arr);
        System.out.println("Enter a number to find the how many elements are strictly greater than that: ");
        int num = sc.nextInt();
        System.out.println(numOfEleStrictlyGreaterThanNum(arr, num)+" elements are strictly grater than "+num+" in an array.");
    }
}
