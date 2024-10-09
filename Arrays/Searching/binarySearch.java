package Arrays.Searching;

import java.util.Scanner;

public class binarySearch {
    static void inputArr(int arr[]){
        System.out.println("Enter the values of an array: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    static void sortArr(int arr[]){
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static int searchKey(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        int mid =(start+end)/2;

        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                end = mid-1;
            }else{
                start = mid;
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
        System.out.println("Before Sorting: ");
        printArr(arr);
        sortArr(arr);
        System.out.println("After Sorting: ");
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
