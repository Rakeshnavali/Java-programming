package problemsOnNumaricalPattern;

import java.util.Scanner;

public class haloTriangularpyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for (int k = 1;k<=2*i-1;k++){
                    if(k==1||k==2*i-1||i==rows){
                    System.out.print(i);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
    
}

