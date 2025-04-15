package Recursion;

public class fibo {
    public static void main(String[] args) {
//        int result = fibo(6);
//        System.out.print(result);
        System.out.println(fiboformula( 50));
    }
    static long fiboformula(int n ){
       return (long)((Math.pow(((1 + Math.sqrt(5))/2),n))/Math.sqrt(5));  // formula we got form solving time complexity
    }                                                                    // now we can find fibonacci no. for large no.

    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
