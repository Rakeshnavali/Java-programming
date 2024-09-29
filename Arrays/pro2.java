package Arrays;
import java.util.Scanner;

import Arrays.pro1;
/*
 * find the last occurrences of an element x in a given array.
 * 
 */
public class pro2 {
    static int lastOccurrence(int arr[],int num){
        int res = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        pro1 p1 = new pro1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        p1.inputArr(arr);
        p1.printArr(arr);
        System.out.println("Enter the number that you have to find last Occurrence of that number: ");
        int num = sc.nextInt();
        System.out.println("The last Occurrence of "+num+" is At "+lastOccurrence(arr, num)+"th index");
    }
}
