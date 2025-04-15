package Recursion;

public class factorial{
    public static void main(String[] args) {
        System.out.println("Factorial is :"+fact(5));
        System.out.println("sum : "+sum(5));
    }
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return  n*fact(n-1);
    }
    // SUM FF THE NUMBER
    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return  n + sum(n-1);
    }
}
