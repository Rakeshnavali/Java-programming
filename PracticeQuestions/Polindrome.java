package PracticeQuestions;

public class Polindrome {
    static void checkPolindrome(int num){
        int Original = num;
        int rev = 0;
        while(num>0){
            rev = rev*10+(num%10);
            num/=10;
        }
        
        if(Original == rev){
            System.out.println("Yes, "+Original+" is polindrome");
        }else{
            System.out.println("No, "+Original+" is not a polindrome");
        }
    }
    public static void main(String[] args) {
        checkPolindrome(161);
    }
}
