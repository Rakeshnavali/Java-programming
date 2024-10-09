package PracticeQuestions;
import java.util.Scanner;
public class reverseNum {
    //Using algorithm
    static int reversingNum(int num){
        int res=0;
        while (num>0) {
            res = res* 10 + (num%10);
            num/=10;
        }
        return res;
    }
    
    //Using Stringbuffer class
    static int reversingNum2(int num){
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        sb.reverse();
        String str = sb.toString();
        int n = Integer.parseInt(str);
        return n;
    }

    //Using StringBuilder class
    static int reversingNUm3(int num){
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        sbl.reverse();
        String str = sbl.toString();
        int n = Integer.parseInt(str);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int ans1 = reversingNum(num);
        System.out.println("Original Value:"+num+" and reversed Value:"+ans1);
        
        int ans2 = reversingNum2(num);
        System.out.println("Original Value:"+num+" and reversed Value:"+ans2);

        int ans3 = reversingNUm3(num);
        System.out.println("Original Value:"+num+" and reversed Value:"+ans2);

    }
}
