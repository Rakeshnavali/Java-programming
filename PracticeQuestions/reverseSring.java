package PracticeQuestions;

public class reverseSring {
    static void reversingString1(String str){
        String rev = "";
        int len = str.length();
        for(int i=len-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Original String:"+str);
        System.out.println("Reversed Srting:"+rev);
    }
    static void reversingString2(String str){
        char arr[] = str.toCharArray();
        String rev = "";
        for(int i=arr.length-1; i>=0; i--){
            rev+=arr[i];
        }
        System.out.println("Original String:"+str);
        System.out.println("Reversed Srting:"+rev);
    }
    public static void main(String[] args) {
        reversingString1("rakesh");
        reversingString2("rakesh");

        
    }
}
