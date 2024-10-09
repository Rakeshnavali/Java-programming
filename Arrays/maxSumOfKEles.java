package Arrays;
/*
 * find max sum of k consecutive elements.
 */
import java.util.Scanner;

public class maxSumOfKEles {

    static void inputArr(int arr[]){
        System.out.print("Enter The elements into a array: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    static void printArr(int arr[]){
        System.out.print("The elements are: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    static int[]  sumOfKElesArr(int arr[], int k){
        int l=0;
        int sumArr[] = new int[arr.length-k+1];
        for(int i=0; i<=arr.length-k; i++){//1 2 3 4 5 6 7 
            for(int j=i; j<i+k; j++){
                sumArr[l] += arr[j];
            }
            l++;
        }
        return sumArr;
    }

    static int findMaxInArr(int arr[]){
        int max = arr[0];
        System.out.println();
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a Size of the Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        inputArr(arr);
        printArr(arr);
        System.out.println();
        System.out.print("Enter the vlaue of k: ");
        int k = sc.nextInt();
        int sumOfkEleArr[] = sumOfKElesArr(arr, k);
        System.out.println();
        System.out.println("Sum Of K elements Array: ");
        printArr(sumOfkEleArr);
        int max = findMaxInArr(sumOfkEleArr);
        System.out.println("max: "+max);
    }
}
