package Arrays.Searching;

import java.util.Scanner;

public class linearSearch {
    static void inputArr(int arr[]){
        System.out.println("Enter the values of an array: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    static int searchKey(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    static void printArr(int arr[]){
        System.out.println("The array values are: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        inputArr(arr);
        printArr(arr);
        System.out.println("How many no of keyes you going to check: ");
        int check = sc.nextInt();
        while(check>0){
            System.out.println("Enter the Key values that we need to search in the array: ");
            int key = sc.nextInt();
            int ans = searchKey(arr, key);
            System.out.println("The Element "+key+" is present at the index of "+ans);
            check--;
        }
    }
}
