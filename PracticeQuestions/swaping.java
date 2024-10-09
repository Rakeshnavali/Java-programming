package PracticeQuestions;

public class swaping {
    //method1
    static void swapAndPrint1(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: a="+a+", b="+b);
    }

    //method2
    static void swapAndPrint2(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping: a="+a+", b="+b);
    }

    //method3
    static void swapAndPrint3(int a,int b){
        a = a*b;  //a=5*2
        b = a/b;  //b = 10/2
        a = a/b;  //a = 10/5
        System.out.println("After Swapping: a="+a+", b="+b);
    }

    //method4(using bitwise xor if both are true output is false if one is true another is false means output true)
    static void swapAndPrint4(int a,int b){
        a = a^b;  //101 ^ 1010 => 1111(17)
        b = a^b;  //1111 ^ 1010 => 0101(10)
        a = a^b;  //1111 ^ 101 => 1010(20)
        System.out.println("After Swapping: a="+a+", b="+b);
    }

    //method5(single statement)
    static void swapAndPrint5(int a,int b){
        a = a+b-(b=a);
        System.out.println("After Swapping: a="+a+", b="+b);
    }
    public static void main(String[] args) {
        int a=10,b=20;

        System.out.println("Before Swapping: a="+a+", b="+b);
        swapAndPrint1(a,b);

        System.out.println("Before Swapping: a="+a+", b="+b);
        swapAndPrint2(a,b);

        System.out.println("Before Swapping: a="+a+", b="+b);
        swapAndPrint3(a,b);

        System.out.println("Before Swapping: a="+a+", b="+b);
        swapAndPrint4(a,b);

        System.out.println("Before Swapping: a="+a+", b="+b);
        swapAndPrint5(a,b);

    }
}
