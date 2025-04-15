package Recursion;

public class ReverseNo {
    public static void main(String[] args){
        System.out.println(reverse(1234));
        System.out.println("palindrome TRUE or FALSE : " + palindrome(1234));
    }
    private static int helperFunction(int n , int digits){
        if(n%10==n){
            return n;
        }
        return (n%10)*(int)(Math.pow(10,digits)) + helperFunction(n/10,digits-1);
    }

    static boolean palindrome(int n){
        return n == reverse(n);
    }

    static int reverse(int n ){
        int digits = (int)(Math.log10(n));
        return helperFunction(n,digits);

    }
}
